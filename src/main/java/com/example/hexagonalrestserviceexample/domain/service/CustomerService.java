package com.example.hexagonalrestserviceexample.domain.service;

import com.example.hexagonalrestserviceexample.domain.model.CustomerDetails;

public interface CustomerService {
    public CustomerDetails getCustomerDetails(String customerId);
}
