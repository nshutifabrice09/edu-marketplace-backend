package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Subject;
import com.edumarketplace.backend.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class SubjectController {

    private final SubjectService subjectService;

    @Autowired
    public SubjectController (SubjectService subjectService){
        this.subjectService = subjectService;
    }

    @GetMapping("/subject/{id}")
    public Subject getSubjectById(@PathVariable ("id") Long id){
        return subjectService.getSubjectById(id);
    }

    @GetMapping("/subjects")
    public List <Subject> subjectList(){
        return subjectService.getAllSubjects();
    }

    @PostMapping("/subject")
    public Subject saveSubject(@RequestBody Subject subject){
        return subjectService.saveSubject(subject);
    }


}
