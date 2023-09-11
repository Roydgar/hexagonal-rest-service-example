package com.example.hexagonalrestserviceexample.endpoint.rest.handler;

import com.example.hexagonalrestserviceexample.domain.exception.ProductNotFoundException;
import com.example.hexagonalrestserviceexample.endpoint.rest.dto.BaseErrorResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    protected ResponseEntity<BaseErrorResponseDto> handle(ProductNotFoundException e, HttpServletRequest request) {
        log.error("Exception handled:", e);

        var responseDto = BaseErrorResponseDto.builder()
                .code("ERR-001")
                .message("Product cannot be found in the system")
                .path(request.getRequestURI())
                .build();

        return ResponseEntity.status(NOT_FOUND).body(responseDto);
    }
}
