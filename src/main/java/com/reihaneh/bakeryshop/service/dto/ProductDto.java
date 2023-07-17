package com.reihaneh.bakeryshop.service.dto;

import com.reihaneh.bakeryshop.domain.enums.Unit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProductDto extends BaseDto {

    private String productName;
    private Double quantity;
    private Unit unit;

    private List<InvoiceItemDto> invoiceItems = new ArrayList<>();
}
