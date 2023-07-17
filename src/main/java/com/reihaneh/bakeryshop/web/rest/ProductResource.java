package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.service.ProductService;
import com.reihaneh.bakeryshop.service.dto.ProductDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductResource extends BaseResource<ProductDto, ProductService, Long> {

    public ProductResource(ProductService service) {
        super(service);
    }
}
