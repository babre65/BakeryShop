package com.reihaneh.bakeryshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LoginHistory extends BaseEntity {

    private LocalDateTime loginDate;
    private LocalDateTime logoutDate;

    @ManyToOne
    private Employee employee;
}
