INSERT INTO app_user (id, username, email) VALUES
(1, 'user1', 'user1@example.com'),
(2, 'user2', 'user2@example.com');

INSERT INTO book (id, title, author, isbn, genre) VALUES
(1, 'The Great Gatsby', 'F. Scott Fitzgerald', '9780743273565', 'FICTION'),
(2, '1984', 'George Orwell', '9780451524935', 'SCI_FI'),
(3, 'Pride and Prejudice', 'Jane Austen', '9780141439518', 'ROMANCE'),
(4, 'The Hobbit', 'J.R.R. Tolkien', '9780547928227', 'FANTASY'),
(5, 'Dune', 'Frank Herbert', '9780441013593', 'SCI_FI'),
(6, 'Gone Girl', 'Gillian Flynn', '9780307588371', 'MYSTERY');

INSERT INTO rating (id, user_id, book_id, rating_value) VALUES
(1, 1, 1, 5),
(2, 1, 2, 4),
(3, 2, 3, 3),
(4, 2, 4, 5);