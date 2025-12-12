package com.example.bookrecommendation.repository;

import com.example.bookrecommendation.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByGenre(Book.Genre genre);
    List<Book> findByAuthorContainingIgnoreCase(String author);
}