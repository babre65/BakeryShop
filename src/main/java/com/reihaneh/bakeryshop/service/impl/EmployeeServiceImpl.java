package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.Employee;
import com.reihaneh.bakeryshop.repository.EmployeeRepository;
import com.reihaneh.bakeryshop.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee, EmployeeRepository, Long> implements EmployeeService {

    public EmployeeServiceImpl(EmployeeRepository repository) {
        super(repository);
    }
}
