package com.edumarketplace.backend.exception;

public class LocationNotFoundException extends RuntimeException{

    public LocationNotFoundException (Long id){
        super("Couldn't find a Location with id "+id);
    }
}
