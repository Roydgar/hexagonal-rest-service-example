package com.example.hexagonalrestserviceexample.domain.exception;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static java.lang.String.format;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExceptionFactory {

    public static ProductNotFoundException productNotFound(String productId) {
        return new ProductNotFoundException(format("Cannot with id [%s] is not found", productId));
    }
}
