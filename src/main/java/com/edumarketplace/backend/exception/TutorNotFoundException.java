package com.edumarketplace.backend.exception;

public class TutorNotFoundException extends RuntimeException{

    public TutorNotFoundException (Long id){
        super ("Couldn't find a Tutor with id "+id);
    }
}
