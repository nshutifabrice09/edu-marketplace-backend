package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Student;
import com.edumarketplace.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public List <Student> studentList(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable ("id") String student_id){
        return studentService.getStudentByStudentId(student_id);
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/update/student/{id}")
    public Student updateStudent(@PathVariable ("id") String student_id, @RequestBody Student student){
        return studentService.updateStudent(student_id, student);
    }

}
