package com.reihaneh.bakeryshop.domain;

import com.reihaneh.bakeryshop.domain.enums.Unit;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class InvoiceItem extends BaseEntity{

    private Double quantity;
    private Unit unit;

    @ManyToOne
    private Invoice invoice;

    @ManyToOne
    private Product product;
}
