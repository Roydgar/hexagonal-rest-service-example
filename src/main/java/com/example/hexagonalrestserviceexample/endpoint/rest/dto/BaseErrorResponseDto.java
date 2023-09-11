package com.example.hexagonalrestserviceexample.endpoint.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseErrorResponseDto {
    private String code;
    private String message;
    private String path;
}
