package com.example.hexagonalrestserviceexample.provider.persistence;

import com.example.hexagonalrestserviceexample.domain.model.Product;
import com.example.hexagonalrestserviceexample.domain.port.ProductProvider;
import com.example.hexagonalrestserviceexample.provider.persistence.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductPersistenceProvider implements ProductProvider {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public Optional<Product> getProduct(String productId) {
        return productRepository.findById(productId).
                map(productMapper::map);
    }

    @Override
    public void saveProduct(Product product) {
        var productEntity = productMapper.map(product);
        productRepository.save(productEntity);
    }
}
