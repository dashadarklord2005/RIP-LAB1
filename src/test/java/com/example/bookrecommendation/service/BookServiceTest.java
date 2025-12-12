package com.example.bookrecommendation.service;

import com.example.bookrecommendation.entity.Book;
import com.example.bookrecommendation.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    void getAllBooks() {
        when(bookRepository.findAll()).thenReturn(List.of(new Book()));
        assertEquals(1, bookService.getAllBooks().size());
    }
}