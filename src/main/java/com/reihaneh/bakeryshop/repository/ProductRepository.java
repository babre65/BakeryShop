package com.reihaneh.bakeryshop.repository;

import com.reihaneh.bakeryshop.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {
}
