package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.EmployeeCredentialService;
import com.reihaneh.bakeryshop.service.dto.EmployeeCredentialDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee-credential")
public class EmployeeCredentialResource extends BaseResource<EmployeeCredentialDto, EmployeeCredentialService, Long> {

    public EmployeeCredentialResource(EmployeeCredentialService service) {
        super(service);
    }
}
