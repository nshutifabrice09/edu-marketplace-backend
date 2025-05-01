package com.edumarketplace.backend.repository;

import com.edumarketplace.backend.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
