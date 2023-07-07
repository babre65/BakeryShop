package com.reihaneh.bakeryshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EmployeeCredential extends BaseEntity{

    private String username;
    private String password;

    @OneToOne
    private Employee employee;

}
