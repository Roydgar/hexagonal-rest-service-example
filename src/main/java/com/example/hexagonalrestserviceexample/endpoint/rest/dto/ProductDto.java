package com.example.hexagonalrestserviceexample.endpoint.rest.dto;

import lombok.Data;

@Data
public class ProductDto {

    private String id;
    private String name;
    private CustomerDetailsDto customerDetails;
}
