package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentByStudentId(String student_id);
    Student saveStudent (Student student);
    Student updateStudent (String student_id, Student student);
    void removeStudentById(String student_id);
}
