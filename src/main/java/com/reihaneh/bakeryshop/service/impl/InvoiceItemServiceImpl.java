package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.InvoiceItem;
import com.reihaneh.bakeryshop.repository.InvoiceItemRepository;
import com.reihaneh.bakeryshop.service.InvoiceItemService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceItemServiceImpl extends BaseServiceImpl<InvoiceItem, InvoiceItemRepository, Long> implements InvoiceItemService {

    public InvoiceItemServiceImpl(InvoiceItemRepository repository) {
        super(repository);
    }
}
