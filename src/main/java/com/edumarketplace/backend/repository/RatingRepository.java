package com.edumarketplace.backend.repository;

import com.edumarketplace.backend.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository <Rating, Long> {
}
