package com.reihaneh.bakeryshop.repository;

import com.reihaneh.bakeryshop.domain.Invoice;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends BaseRepository<Invoice, Long> {
}
