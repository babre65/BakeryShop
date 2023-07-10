package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.BaseEntity;
import com.reihaneh.bakeryshop.repository.BaseRepository;
import com.reihaneh.bakeryshop.service.BaseService;

import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<T extends BaseEntity, R extends BaseRepository<T,ID>, ID> implements BaseService<T,ID> {

    private final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        T save = repository.save(entity);
        return save;
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
