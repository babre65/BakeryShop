package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.BaseService;
import com.reihaneh.bakeryshop.service.dto.BaseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class BaseResource<D extends BaseDto, S extends BaseService<D, ID>, ID> {

    private final S service;

    public BaseResource(S service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<D> create(@RequestBody D dto) {
        if (dto.getId() != null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id should be null.");

        D save = service.save(dto);
        return ResponseEntity.ok(save);
    }


    @PutMapping
    public ResponseEntity<D> update(@RequestBody D dto) {
        if (dto.getId() == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id shouldn't be null.");

        D save = service.save(dto);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable ID id){
        Optional<D> byId = service.findById(id);

        return ResponseEntity.of(byId);
    }

    @GetMapping
    public ResponseEntity<List<D>> findAll()
    {
        List<D> all = service.findAll();

        return ResponseEntity.ok(all);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable ID id){
        service.deleteById(id);

        return ResponseEntity.ok(null);
    }
}
