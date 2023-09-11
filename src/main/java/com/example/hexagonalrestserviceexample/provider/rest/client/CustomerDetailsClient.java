package com.example.hexagonalrestserviceexample.provider.rest.client;

import com.example.hexagonalrestserviceexample.domain.model.CustomerDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetailsClient {

    public CustomerDetails getCustomerDetails(String customerId) {
        // Here could be your rest request to an external service
        var customerDetails = new CustomerDetails();
        customerDetails.setFirstName("Happy");
        customerDetails.setLastName("Customer");

        return customerDetails;
    }
}
