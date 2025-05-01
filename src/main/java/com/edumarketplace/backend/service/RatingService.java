package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Rating;

import java.util.List;

public interface RatingService {
    List<Rating> getAllRatings();
    Rating getRatingById(Long id);
    Rating saveRating(Rating rating);
    Rating updateRating(Long id, Rating rating);
    void removeRatingById(Long id);
}
