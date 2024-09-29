package com.example.EmailService.Core.Exceptions;

public class EmailServiceException extends RuntimeException{
    public EmailServiceException(String message){
        super(message);
    }

    public EmailServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
