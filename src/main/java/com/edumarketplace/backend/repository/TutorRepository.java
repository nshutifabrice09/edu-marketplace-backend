package com.edumarketplace.backend.repository;

import com.edumarketplace.backend.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository <Tutor, Long> {
}
