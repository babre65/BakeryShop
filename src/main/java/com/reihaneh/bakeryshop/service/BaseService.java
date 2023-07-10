package com.reihaneh.bakeryshop.service;

import com.reihaneh.bakeryshop.domain.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseEntity, ID> {

    T save(T entity);

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);
}
