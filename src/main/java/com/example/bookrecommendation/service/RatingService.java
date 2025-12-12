package com.example.bookrecommendation.service;

import com.example.bookrecommendation.entity.Rating;
import com.example.bookrecommendation.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RatingService {
    private final RatingRepository ratingRepository;

    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public List<Rating> getUserRatings(Long userId) {
        return ratingRepository.findByUserId(userId);
    }
}