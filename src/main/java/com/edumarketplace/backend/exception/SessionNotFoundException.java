package com.edumarketplace.backend.exception;

public class SessionNotFoundException extends RuntimeException {

    public SessionNotFoundException (Long id){
        super("Couldn't find a Session with id "+id);
    }
}
