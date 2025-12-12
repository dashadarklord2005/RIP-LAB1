package com.example.bookrecommendation.service;

import com.example.bookrecommendation.entity.Book;
import com.example.bookrecommendation.entity.Rating;
import com.example.bookrecommendation.repository.BookRepository;
import com.example.bookrecommendation.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RecommendationService {
    private final BookRepository bookRepository;
    private final RatingRepository ratingRepository;

    public List<Book> getRecommendations(Long userId) {
        // Получаем оценки пользователя
        List<Rating> userRatings = ratingRepository.findByUserId(userId);

        if (userRatings.isEmpty()) {
            return bookRepository.findAll().subList(0, Math.min(5, bookRepository.findAll().size()));
        }

        // Находим любимые жанры пользователя (оценка 4+)
        Set<Book.Genre> favoriteGenres = userRatings.stream()
                .filter(rating -> rating.getRatingValue() >= 4)
                .map(rating -> rating.getBook().getGenre())
                .collect(Collectors.toSet());

        // Рекомендуем книги любимых жанров, которые пользователь еще не оценивал
        List<Book> allBooks = bookRepository.findAll();
        Set<Long> ratedBookIds = userRatings.stream()
                .map(rating -> rating.getBook().getId())
                .collect(Collectors.toSet());

        return allBooks.stream()
                .filter(book -> favoriteGenres.contains(book.getGenre()))
                .filter(book -> !ratedBookIds.contains(book.getId()))
                .limit(5)
                .collect(Collectors.toList());
    }
}