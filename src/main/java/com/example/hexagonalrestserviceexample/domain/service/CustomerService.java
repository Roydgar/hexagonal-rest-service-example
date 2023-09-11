package com.example.hexagonalrestserviceexample.domain.service;

import com.example.hexagonalrestserviceexample.domain.model.CustomerDetails;

public interface CustomerService {
    CustomerDetails getCustomerDetails(String customerId);
}
