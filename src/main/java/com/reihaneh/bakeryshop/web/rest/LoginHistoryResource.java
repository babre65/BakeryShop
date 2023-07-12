package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.LoginHistory;
import com.reihaneh.bakeryshop.service.LoginHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login-history")
public class LoginHistoryResource extends BaseResource<LoginHistory, LoginHistoryService, Long> {

    public LoginHistoryResource(LoginHistoryService service) {
        super(service);
    }
}
