package com.vishnu.accounts.service;

import com.vishnu.accounts.dto.CustomerDto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;

public interface IAccountsService {

    /**
    *
    *@param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return  boolean indicating if the deletion of account is successful or not
     */
    boolean deleteAccount(String mobileNumber);

    boolean updateCommunicationStatus(Long accountNumber);
}
