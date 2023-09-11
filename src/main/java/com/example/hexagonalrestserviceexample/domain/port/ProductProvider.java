package com.example.hexagonalrestserviceexample.domain.port;

import com.example.hexagonalrestserviceexample.domain.model.Product;

import java.util.Optional;

public interface ProductProvider {
    Optional<Product> getProduct(String productId);

    void saveProduct(Product product);
}
