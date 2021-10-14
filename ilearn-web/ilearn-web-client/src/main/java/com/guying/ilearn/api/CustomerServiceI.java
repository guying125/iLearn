package com.guying.ilearn.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.guying.ilearn.dto.CustomerAddCmd;
import com.guying.ilearn.dto.CustomerListByNameQry;
import com.guying.ilearn.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
