package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.Employee;
import com.reihaneh.bakeryshop.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeResource extends BaseResource<Employee, EmployeeService, Long> {

    public EmployeeResource(EmployeeService service) {
        super(service);
    }
}
