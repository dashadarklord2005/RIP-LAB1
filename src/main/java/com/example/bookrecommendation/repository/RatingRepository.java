package com.example.bookrecommendation.repository;

import com.example.bookrecommendation.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByUserId(Long userId);
    List<Rating> findByBookId(Long bookId);
    Optional<Rating> findByUserIdAndBookId(Long userId, Long bookId);
}