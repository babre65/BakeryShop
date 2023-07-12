package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.Vat;
import com.reihaneh.bakeryshop.service.VatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vat")
public class VatResource extends BaseResource<Vat, VatService, Long> {

    public VatResource(VatService service) {
        super(service);
    }
}
