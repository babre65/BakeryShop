package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.DiscountService;
import com.reihaneh.bakeryshop.service.dto.DiscountDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discount")
public class DiscountResource extends BaseResource<DiscountDto, DiscountService, Long> {

    public DiscountResource(DiscountService service) {
        super(service);
    }
}
