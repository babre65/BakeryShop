package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.EmployeeCredential;
import com.reihaneh.bakeryshop.service.EmployeeCredentialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee-credential")
public class EmployeeCredentialResource extends BaseResource<EmployeeCredential, EmployeeCredentialService, Long> {

    public EmployeeCredentialResource(EmployeeCredentialService service) {
        super(service);
    }
}
