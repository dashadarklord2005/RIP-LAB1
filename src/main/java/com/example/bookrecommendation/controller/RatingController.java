package com.example.bookrecommendation.controller;

import com.example.bookrecommendation.entity.Rating;
import com.example.bookrecommendation.service.RatingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ratings")
@RequiredArgsConstructor
public class RatingController {
    private final RatingService ratingService;

    @PostMapping
    public Rating createRating(@Valid @RequestBody Rating rating) {
        return ratingService.saveRating(rating);
    }

    @GetMapping("/user/{userId}")
    public List<Rating> getUserRatings(@PathVariable Long userId) {
        return ratingService.getUserRatings(userId);
    }
}