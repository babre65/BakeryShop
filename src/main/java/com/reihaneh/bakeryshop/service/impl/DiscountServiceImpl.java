package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.Discount;
import com.reihaneh.bakeryshop.repository.DiscountRepository;
import com.reihaneh.bakeryshop.service.DiscountService;
import com.reihaneh.bakeryshop.service.dto.DiscountDto;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl extends BaseServiceImpl<Discount, DiscountDto, DiscountRepository, Long> implements DiscountService {

    public DiscountServiceImpl(DiscountRepository repository) {
        super(repository, Discount.class, DiscountDto.class);
    }
}
