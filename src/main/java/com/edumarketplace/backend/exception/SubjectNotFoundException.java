package com.edumarketplace.backend.exception;

public class SubjectNotFoundException extends RuntimeException{

    public SubjectNotFoundException (Long id){
        super("Couldn't find a Subject with id "+id);
    }
}
