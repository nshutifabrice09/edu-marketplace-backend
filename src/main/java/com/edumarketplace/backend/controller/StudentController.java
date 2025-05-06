package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Student;
import com.edumarketplace.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public Student saveStudent(Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List <Student> studentList(){
        return studentService.getAllStudents();
    }
}
