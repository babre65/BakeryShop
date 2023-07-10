package com.reihaneh.bakeryshop.repository;

import com.reihaneh.bakeryshop.domain.InvoiceItem;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceItemRepository extends BaseRepository<InvoiceItem, Long> {
}
