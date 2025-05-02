package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentByStudentId(String student_id) {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(String student_id, Student student) {
        return null;
    }

    @Override
    public void removeStudentById(String student_id) {

    }
}
