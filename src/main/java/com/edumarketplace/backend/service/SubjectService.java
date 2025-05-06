package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
    Subject saveSubject(Subject subject);
    Subject updateSubject(Long id, Subject subject);
    void removeSubjectById(Long id);
}
