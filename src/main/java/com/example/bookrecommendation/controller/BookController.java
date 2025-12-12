package com.example.bookrecommendation.controller;

import com.example.bookrecommendation.entity.Book;
import com.example.bookrecommendation.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/genre/{genre}")
    public List<Book> getBooksByGenre(@PathVariable Book.Genre genre) {
        return bookService.getBooksByGenre(genre);
    }

    @PostMapping
    public Book createBook(@Valid @RequestBody Book book) {
        return bookService.saveBook(book);
    }
}