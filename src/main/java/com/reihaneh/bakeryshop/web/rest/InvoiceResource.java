package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.Invoice;
import com.reihaneh.bakeryshop.service.InvoiceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceResource extends BaseResource<Invoice, InvoiceService,Long> {

    public InvoiceResource(InvoiceService service) {
        super(service);
    }
}
