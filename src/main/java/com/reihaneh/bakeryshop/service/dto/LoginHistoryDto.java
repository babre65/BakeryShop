package com.reihaneh.bakeryshop.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LoginHistoryDto extends BaseDto {

    private LocalDateTime loginDate;
    private LocalDateTime logoutDate;

    private Long employeeId;
}
