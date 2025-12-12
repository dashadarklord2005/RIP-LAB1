package com.example.bookrecommendation.controller;

import com.example.bookrecommendation.entity.Book;
import com.example.bookrecommendation.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
@RequiredArgsConstructor
public class RecommendationController {
    private final RecommendationService recommendationService;

    @GetMapping("/user/{userId}")
    public List<Book> getRecommendations(@PathVariable Long userId) {
        return recommendationService.getRecommendations(userId);
    }
}