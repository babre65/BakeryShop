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
public class CustomerDto extends BaseDto {

    private LocalDateTime registerDate = LocalDateTime.now();

    private List<InvoiceDto> invoices = new ArrayList<>();
}
