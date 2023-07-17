package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.BaseEntity;
import com.reihaneh.bakeryshop.repository.BaseRepository;
import com.reihaneh.bakeryshop.service.BaseService;
import com.reihaneh.bakeryshop.service.dto.BaseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BaseServiceImpl<T extends BaseEntity, D extends BaseDto, R extends BaseRepository<T,ID>, ID> implements BaseService<D,ID> {

    private final R repository;

    @Autowired
    private ModelMapper mapper;
    private final Class<T> entityClass;
    private final Class<D> dtoClass;

    public BaseServiceImpl(R repository, Class<T> entityClass, Class<D> dtoClass) {
        this.repository = repository;
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    @Override
    public D save(D dto) {
        T entity = mapper.map(dto, entityClass);
        T save = repository.save(entity);
        return mapper.map(save, dtoClass);
    }

    @Override
    public Optional<D> findById(ID id) {
        Optional<T> byId = repository.findById(id);
        return byId.map(t -> mapper.map(t, dtoClass));
    }

    @Override
    public List<D> findAll() {
        List<T> all = repository.findAll();
        return all.stream().map(t -> mapper.map(t, dtoClass)).toList();
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
