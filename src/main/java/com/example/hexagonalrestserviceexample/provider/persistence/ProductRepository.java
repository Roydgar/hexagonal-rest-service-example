package com.example.hexagonalrestserviceexample.provider.persistence;

import com.example.hexagonalrestserviceexample.provider.persistence.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
