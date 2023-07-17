package com.reihaneh.bakeryshop.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PersonDto extends BaseDto{

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String address;
    private LocalDateTime birthDate;
}
