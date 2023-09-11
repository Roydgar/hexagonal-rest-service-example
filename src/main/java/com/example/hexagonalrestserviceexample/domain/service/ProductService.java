package com.example.hexagonalrestserviceexample.domain.service;

import com.example.hexagonalrestserviceexample.domain.model.Product;

public interface ProductService {

    Product getProduct(String productId);
    void saveProduct(Product product);
}
