package com.reihaneh.bakeryshop.service.dto;

import com.reihaneh.bakeryshop.domain.enums.Unit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class InvoiceItemDto extends BaseDto {

    private Double quantity;
    private Unit unit;

    private Long invoiceId;

    private Long productId;
}
