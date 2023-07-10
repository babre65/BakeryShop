package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.EmployeeCredential;
import com.reihaneh.bakeryshop.repository.EmployeeCredentialRepository;
import com.reihaneh.bakeryshop.service.EmployeeCredentialService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeCredentialServiceImpl
        extends BaseServiceImpl<EmployeeCredential, EmployeeCredentialRepository, Long>
        implements EmployeeCredentialService {

    public EmployeeCredentialServiceImpl(EmployeeCredentialRepository repository) {
        super(repository);
    }
}
