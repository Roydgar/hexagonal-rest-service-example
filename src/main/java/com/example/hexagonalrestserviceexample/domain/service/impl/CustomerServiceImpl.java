package com.example.hexagonalrestserviceexample.domain.service.impl;

import com.example.hexagonalrestserviceexample.domain.model.CustomerDetails;
import com.example.hexagonalrestserviceexample.domain.port.CustomerDetailsProvider;
import com.example.hexagonalrestserviceexample.domain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDetailsProvider customerDetailsProvider;

    @Override
    public CustomerDetails getCustomerDetails(String customerId) {
        log.info("Looking for customer details of a customer with id [{}]", customerId);
        return customerDetailsProvider.getCustomerDetails(customerId);
    }
}
