package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.Product;
import com.reihaneh.bakeryshop.repository.ProductRepository;
import com.reihaneh.bakeryshop.service.ProductService;
import com.reihaneh.bakeryshop.service.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, ProductDto, ProductRepository, Long> implements ProductService {

    public ProductServiceImpl(ProductRepository repository) {
        super(repository, Product.class, ProductDto.class);
    }
}
