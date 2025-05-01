package com.edumarketplace.backend.repository;

import com.edumarketplace.backend.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository <Tutor, Long> {
}
