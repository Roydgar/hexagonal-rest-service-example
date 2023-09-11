package com.example.hexagonalrestserviceexample.endpoint.rest.mapper;


import com.example.hexagonalrestserviceexample.config.CommonMapperConfig;
import com.example.hexagonalrestserviceexample.domain.model.CustomerDetails;
import com.example.hexagonalrestserviceexample.domain.model.Product;
import com.example.hexagonalrestserviceexample.endpoint.rest.dto.CreateProductRequest;
import com.example.hexagonalrestserviceexample.endpoint.rest.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = CommonMapperConfig.class)
public interface ProductDtoMapper {

    @Mapping(source = "customerDetails", target = "customerDetails")
    ProductDto map(Product productEntity, CustomerDetails customerDetails);

    Product map(CreateProductRequest createProductRequest);
}
