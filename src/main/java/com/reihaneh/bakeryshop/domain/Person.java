package com.reihaneh.bakeryshop.domain;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String address;
    private LocalDateTime birthDate;

}
