package com.reihaneh.bakeryshop.repository;

import com.reihaneh.bakeryshop.domain.Discount;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends BaseRepository<Discount, Long> {
}
