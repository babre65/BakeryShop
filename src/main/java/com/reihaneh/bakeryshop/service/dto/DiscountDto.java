package com.reihaneh.bakeryshop.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DiscountDto extends BaseDto {


    private String title;
    private Double percent;

    private List<InvoiceDto> invoices = new ArrayList<>();
}
