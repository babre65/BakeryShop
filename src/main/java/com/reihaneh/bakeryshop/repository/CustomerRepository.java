package com.reihaneh.bakeryshop.repository;

import com.reihaneh.bakeryshop.domain.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends BaseRepository<Customer, Long> {
}
