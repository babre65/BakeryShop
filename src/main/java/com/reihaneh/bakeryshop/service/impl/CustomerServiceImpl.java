package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.Customer;
import com.reihaneh.bakeryshop.repository.CustomerRepository;
import com.reihaneh.bakeryshop.service.CustomerService;
import com.reihaneh.bakeryshop.service.dto.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerDto, CustomerRepository, Long> implements CustomerService {

    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository, Customer.class, CustomerDto.class);
    }
}
