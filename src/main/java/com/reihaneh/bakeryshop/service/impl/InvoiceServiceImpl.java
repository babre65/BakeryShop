package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.Invoice;
import com.reihaneh.bakeryshop.repository.InvoiceRepository;
import com.reihaneh.bakeryshop.service.InvoiceService;
import com.reihaneh.bakeryshop.service.dto.InvoiceDto;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl extends BaseServiceImpl<Invoice, InvoiceDto, InvoiceRepository, Long> implements InvoiceService {

    public InvoiceServiceImpl(InvoiceRepository repository) {
        super(repository, Invoice.class, InvoiceDto.class);
    }
}
