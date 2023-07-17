package com.reihaneh.bakeryshop.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class InvoiceDto extends BaseDto {

    private Double totalAmount;
    private Double totalVatAmount;
    private Double discountAmount;

    private Long employeeId;

    private Long customerId;

    private Long vatId;

    private Long discountId;

    private List<InvoiceItemDto> invoiceItems = new ArrayList<>();
}
