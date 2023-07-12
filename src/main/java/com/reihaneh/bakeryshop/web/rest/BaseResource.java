package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.BaseEntity;
import com.reihaneh.bakeryshop.service.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class BaseResource<T extends BaseEntity, S extends BaseService<T, ID>, ID> {

    private final S service;

    public BaseResource(S service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        if (entity.getId() != null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id should be null.");

        T save = service.save(entity);
        return ResponseEntity.ok(save);
    }


    @PutMapping
    public ResponseEntity<T> update(@RequestBody T entity) {
        if (entity.getId() == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id shouldn't be null.");

        T save = service.save(entity);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable ID id){
        Optional<T> byId = service.findById(id);

        return ResponseEntity.of(byId);
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll()
    {
        List<T> all = service.findAll();

        return ResponseEntity.ok(all);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable ID id){
        service.deleteById(id);

        return ResponseEntity.ok(null);
    }
}
