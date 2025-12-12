package com.example.bookrecommendation.config;

import com.example.bookrecommendation.entity.Book;
import com.example.bookrecommendation.entity.User;
import com.example.bookrecommendation.repository.BookRepository;
import com.example.bookrecommendation.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        // Создаем тестовых пользователей
        User user1 = new User();
        user1.setUsername("user1");
        user1.setEmail("user1@example.com");
        userRepository.save(user1);

        User user2 = new User();
        user2.setUsername("user2");
        user2.setEmail("user2@example.com");
        userRepository.save(user2);

        // Создаем тестовые книги
        Book book1 = new Book();
        book1.setTitle("The Great Gatsby");
        book1.setAuthor("F. Scott Fitzgerald");
        book1.setIsbn("9780743273565");
        book1.setGenre(Book.Genre.FICTION);
        bookRepository.save(book1);

        Book book2 = new Book();
        book2.setTitle("1984");
        book2.setAuthor("George Orwell");
        book2.setIsbn("9780451524935");
        book2.setGenre(Book.Genre.SCI_FI);
        bookRepository.save(book2);

        Book book3 = new Book();
        book3.setTitle("Pride and Prejudice");
        book3.setAuthor("Jane Austen");
        book3.setIsbn("9780141439518");
        book3.setGenre(Book.Genre.ROMANCE);
        bookRepository.save(book3);
    }
}