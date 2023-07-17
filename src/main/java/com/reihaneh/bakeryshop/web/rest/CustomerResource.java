package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.CustomerService;
import com.reihaneh.bakeryshop.service.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerResource extends BaseResource<CustomerDto, CustomerService, Long> {

    public CustomerResource(CustomerService service) {
        super(service);
    }
}
