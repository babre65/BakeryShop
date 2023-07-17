package com.reihaneh.bakeryshop.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EmployeeCredentialDto extends BaseDto {

    private String username;
    private String password;

    private Long employeeId;
}
