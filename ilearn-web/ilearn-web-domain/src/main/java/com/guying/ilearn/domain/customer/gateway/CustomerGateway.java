package com.guying.ilearn.domain.customer.gateway;

import com.guying.ilearn.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
