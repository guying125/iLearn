package com.guying.ilearn.domain.customer.gateway;

import com.guying.ilearn.domain.customer.Customer;
import com.guying.ilearn.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
