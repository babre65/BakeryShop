package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.EmployeeService;
import com.reihaneh.bakeryshop.service.dto.EmployeeDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeResource extends BaseResource<EmployeeDto, EmployeeService, Long> {

    public EmployeeResource(EmployeeService service) {
        super(service);
    }
}
