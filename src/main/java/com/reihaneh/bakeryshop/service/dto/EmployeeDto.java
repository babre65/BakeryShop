package com.reihaneh.bakeryshop.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EmployeeDto extends PersonDto {

    private LocalDateTime hireDate;

    private List<LoginHistoryDto> loginHistories = new ArrayList<>();

    private List<InvoiceDto> invoices = new ArrayList<>();
}
