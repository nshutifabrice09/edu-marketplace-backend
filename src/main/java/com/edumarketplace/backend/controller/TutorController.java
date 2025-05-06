package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Tutor;
import com.edumarketplace.backend.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TutorController {

    private final TutorService tutorService;

    @Autowired
    public TutorController (TutorService tutorService){
        this.tutorService = tutorService;
    }

    @GetMapping("/tutors")
    public List<Tutor> tutorList(){
        return tutorService.getAllTutors();
    }

    @GetMapping("/tutor/{id}")
    public Tutor getTutorById(@PathVariable ("id") Long id){
        return tutorService.getTutorById(id);
    }
}
