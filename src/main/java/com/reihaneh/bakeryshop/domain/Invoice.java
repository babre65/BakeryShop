package com.reihaneh.bakeryshop.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Invoice extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long invoiceNo;
    private Double totalAmount;
    private Double totalVatAmount;
    private Double discountAmount;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Vat vat;

    @ManyToOne
    private Discount discount;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<InvoiceItem> invoiceItems = new ArrayList<>();
}
