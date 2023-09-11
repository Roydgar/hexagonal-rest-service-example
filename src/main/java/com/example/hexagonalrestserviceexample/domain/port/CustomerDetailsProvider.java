package com.example.hexagonalrestserviceexample.domain.port;

import com.example.hexagonalrestserviceexample.domain.model.CustomerDetails;

public interface CustomerDetailsProvider {

    CustomerDetails getCustomerDetails(String customerId);
}
