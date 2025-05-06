package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Rating;
import com.edumarketplace.backend.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class RatingController {

    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService){
        this.ratingService = ratingService;
    }

    @GetMapping("/ratings")
    public List<Rating> ratingList(){
        return ratingService.getAllRatings();
    }

    @GetMapping("/rating/{id}")
    public Rating getRatingById(@PathVariable ("id") Long id){
        return ratingService.getRatingById(id);
    }

    @PostMapping("rating")
    public Rating saveRating(@RequestBody Rating rating){
        return ratingService.saveRating(rating);
    }

    @PutMapping("/update/rating/{id}")
    public Rating updateRating(@PathVariable ("id") Long id, @RequestBody Rating rating){
        return ratingService.updateRating(id, rating);
    }


}
