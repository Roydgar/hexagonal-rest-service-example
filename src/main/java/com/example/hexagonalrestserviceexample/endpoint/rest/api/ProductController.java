package com.example.hexagonalrestserviceexample.endpoint.rest.api;

import com.example.hexagonalrestserviceexample.domain.service.CustomerService;
import com.example.hexagonalrestserviceexample.domain.service.ProductService;
import com.example.hexagonalrestserviceexample.endpoint.rest.dto.CreateProductRequest;
import com.example.hexagonalrestserviceexample.endpoint.rest.dto.ProductDto;
import com.example.hexagonalrestserviceexample.endpoint.rest.mapper.ProductDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final CustomerService customerService;
    private final ProductDtoMapper mapper;

    @GetMapping("/{productId}")
    public ProductDto getById(@PathVariable String productId) {
        var product = productService.getProduct(productId);
        var customerDetails = customerService.getCustomerDetails(product.getCustomerId());

        return mapper.map(product, customerDetails);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void getById(@RequestBody CreateProductRequest createProductRequest) {
        productService.saveProduct(mapper.map(createProductRequest));
    }
}
