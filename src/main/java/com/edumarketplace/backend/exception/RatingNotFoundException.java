package com.edumarketplace.backend.exception;

public class RatingNotFoundException extends RuntimeException{

    public RatingNotFoundException (Long id){
        super ("Couldn't find a Rating with id "+id);
    }
}
