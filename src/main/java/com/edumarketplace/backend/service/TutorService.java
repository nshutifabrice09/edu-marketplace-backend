package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Tutor;

import java.util.List;

public interface TutorService {
    List<Tutor> getAllTutors();
    Tutor getTutorById(Long id);
    Tutor saveTutor(Tutor tutor);
    Tutor updateTutor(Long id, Tutor tutor);
    void removeTutorById(Long id);
}
