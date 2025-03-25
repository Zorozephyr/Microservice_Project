package com.vishnu.accounts.service;

import com.vishnu.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

    CustomerDetailsDto fetchCustomerDetails(String mobileNum,String correlationId);
}
