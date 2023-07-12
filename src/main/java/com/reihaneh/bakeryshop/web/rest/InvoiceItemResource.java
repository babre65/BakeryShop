package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.InvoiceItem;
import com.reihaneh.bakeryshop.service.InvoiceItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoice-item")
public class InvoiceItemResource extends BaseResource<InvoiceItem, InvoiceItemService, Long> {

    public InvoiceItemResource(InvoiceItemService service) {
        super(service);
    }
}
