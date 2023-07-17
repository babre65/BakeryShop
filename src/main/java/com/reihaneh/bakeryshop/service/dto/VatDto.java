package com.reihaneh.bakeryshop.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class VatDto extends BaseDto {

    private Integer vatPercent;
    private Integer vatYear;

//    private List<InvoiceDto> invoices = new ArrayList<>();
}
