package com.reihaneh.bakeryshop.domain;

import com.reihaneh.bakeryshop.domain.enums.Unit;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends BaseEntity{

    private String productName;
    private Double quantity;
    private Unit unit;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<InvoiceItem> invoiceItems = new ArrayList<>();

}
