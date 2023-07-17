package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.Vat;
import com.reihaneh.bakeryshop.repository.VatRepository;
import com.reihaneh.bakeryshop.service.VatService;
import com.reihaneh.bakeryshop.service.dto.VatDto;
import org.springframework.stereotype.Service;

@Service
public class VatServiceImpl extends BaseServiceImpl<Vat, VatDto, VatRepository, Long> implements VatService {

    public VatServiceImpl(VatRepository repository) {
        super(repository, Vat.class, VatDto.class);
    }
}
