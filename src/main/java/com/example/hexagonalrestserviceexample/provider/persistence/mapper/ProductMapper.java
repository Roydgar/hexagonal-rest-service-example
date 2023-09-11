package com.example.hexagonalrestserviceexample.provider.persistence.mapper;


import com.example.hexagonalrestserviceexample.config.CommonMapperConfig;
import com.example.hexagonalrestserviceexample.domain.model.Product;
import com.example.hexagonalrestserviceexample.provider.persistence.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapperConfig.class)
public interface ProductMapper {

    Product map(ProductEntity productEntity);

    ProductEntity map(Product product);
}
