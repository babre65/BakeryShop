package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.VatService;
import com.reihaneh.bakeryshop.service.dto.VatDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vat")
public class VatResource extends BaseResource<VatDto, VatService, Long> {

    public VatResource(VatService service) {
        super(service);
    }
}
