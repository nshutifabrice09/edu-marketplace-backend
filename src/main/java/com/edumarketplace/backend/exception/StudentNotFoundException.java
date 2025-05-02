package com.edumarketplace.backend.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException (String student_id){
        super("Couldn't find a Student with id "+student_id);
    }
}
