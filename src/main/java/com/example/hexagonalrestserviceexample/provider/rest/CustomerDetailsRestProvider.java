package com.example.hexagonalrestserviceexample.provider.rest;

import com.example.hexagonalrestserviceexample.domain.model.CustomerDetails;
import com.example.hexagonalrestserviceexample.domain.port.CustomerDetailsProvider;
import com.example.hexagonalrestserviceexample.provider.rest.client.CustomerDetailsClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerDetailsRestProvider implements CustomerDetailsProvider {

    private final CustomerDetailsClient client;

    @Override
    public CustomerDetails getCustomerDetails(String customerId) {
        return client.getCustomerDetails(customerId);
    }
}
