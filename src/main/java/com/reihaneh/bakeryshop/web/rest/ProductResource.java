package com.reihaneh.bakeryshop.web.rest;

import com.reihaneh.bakeryshop.domain.Product;
import com.reihaneh.bakeryshop.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductResource extends BaseResource<Product, ProductService, Long> {

    public ProductResource(ProductService service) {
        super(service);
    }
}
