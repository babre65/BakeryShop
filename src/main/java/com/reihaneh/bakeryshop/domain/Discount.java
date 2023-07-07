package com.reihaneh.bakeryshop.domain;

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
public class Discount extends BaseEntity{

    private String title;
    private Double percent;

    @OneToMany(mappedBy = "discount", cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Invoice> invoices = new ArrayList<>();

}
