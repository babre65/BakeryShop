package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.Customer;
import com.reihaneh.bakeryshop.repository.CustomerRepository;
import com.reihaneh.bakeryshop.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerRepository, Long> implements CustomerService {

    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository);
    }
}
