package kg.alatoo.bookstore;

import kg.alatoo.bookstore.entities.Book;

public interface BookService {

    Book updateBook(Long id, Book book);

    Book addBook(Book book);
}
