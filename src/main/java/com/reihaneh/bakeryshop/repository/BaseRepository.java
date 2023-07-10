package com.reihaneh.bakeryshop.repository;

import com.reihaneh.bakeryshop.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T extends BaseEntity, ID> extends JpaRepository<T, ID> {
}
