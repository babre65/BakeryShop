package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.LoginHistoryService;
import com.reihaneh.bakeryshop.service.dto.LoginHistoryDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login-history")
public class LoginHistoryResource extends BaseResource<LoginHistoryDto, LoginHistoryService, Long> {

    public LoginHistoryResource(LoginHistoryService service) {
        super(service);
    }
}
