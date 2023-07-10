package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.Invoice;
import com.reihaneh.bakeryshop.repository.InvoiceRepository;
import com.reihaneh.bakeryshop.service.InvoiceService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl extends BaseServiceImpl<Invoice, InvoiceRepository, Long> implements InvoiceService {

    public InvoiceServiceImpl(InvoiceRepository repository) {
        super(repository);
    }
}
