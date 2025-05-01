package com.edumarketplace.backend.repository;

import com.edumarketplace.backend.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository <Rating, Long> {
}
