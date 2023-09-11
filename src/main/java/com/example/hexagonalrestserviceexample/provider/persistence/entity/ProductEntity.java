package com.example.hexagonalrestserviceexample.provider.persistence.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class ProductEntity {

    @Id
    private String id;
    private String name;
    private String customerId;
}
