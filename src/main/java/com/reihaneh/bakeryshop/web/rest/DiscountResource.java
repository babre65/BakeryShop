package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.Discount;
import com.reihaneh.bakeryshop.service.DiscountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discount")
public class DiscountResource extends BaseResource<Discount, DiscountService, Long> {

    public DiscountResource(DiscountService service) {
        super(service);
    }
}
