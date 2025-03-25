package com.vishnu.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message, String fieldName, String fieldValue){
        super(String.format("%s: Field '%s' has an invalid value '%s'", message, fieldName, fieldValue));
    }
}
