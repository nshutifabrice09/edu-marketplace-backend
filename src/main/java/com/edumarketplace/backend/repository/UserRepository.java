package com.edumarketplace.backend.repository;

import com.edumarketplace.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
