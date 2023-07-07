package com.reihaneh.bakeryshop.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Employee extends Person {

    private LocalDateTime hireDate;

    @OneToMany(mappedBy = "employee", cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<LoginHistory> loginHistories = new ArrayList<>();

    @OneToMany(mappedBy = "employee", cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Invoice> invoices = new ArrayList<>();

}
