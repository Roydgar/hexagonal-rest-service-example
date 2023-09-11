package com.example.hexagonalrestserviceexample.domain.service.impl;

import com.example.hexagonalrestserviceexample.domain.exception.ExceptionFactory;
import com.example.hexagonalrestserviceexample.domain.model.Product;
import com.example.hexagonalrestserviceexample.domain.port.ProductProvider;
import com.example.hexagonalrestserviceexample.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductProvider productProvider;

    @Override
    public Product getProduct(String productId) {
        log.info("Looking for a product with id [{}]", productId);
        return productProvider.getProduct(productId)
                .orElseThrow(() -> ExceptionFactory.productNotFound(productId));
    }

    @Override
    public void saveProduct(Product product) {
        log.info("Saving a new product with name [{}]", product.getName());
        productProvider.saveProduct(product);
    }
}
