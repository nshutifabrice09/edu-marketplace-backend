package com.edumarketplace.backend.exception;

public class PaymentNotFoundException extends RuntimeException{
    public PaymentNotFoundException (Long id){
        super ("Couldn't find a Payment with id "+id);
    }
}
