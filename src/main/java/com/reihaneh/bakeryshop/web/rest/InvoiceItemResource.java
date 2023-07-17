package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.InvoiceItemService;
import com.reihaneh.bakeryshop.service.dto.InvoiceItemDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoice-item")
public class InvoiceItemResource extends BaseResource<InvoiceItemDto, InvoiceItemService, Long> {

    public InvoiceItemResource(InvoiceItemService service) {
        super(service);
    }
}
