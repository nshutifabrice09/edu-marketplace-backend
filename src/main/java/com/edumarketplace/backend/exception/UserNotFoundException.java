package com.edumarketplace.backend.exception;


public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super ("Couldn't find a User with id "+id);
    }
}
