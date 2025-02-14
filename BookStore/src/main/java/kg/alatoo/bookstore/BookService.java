package kg.alatoo.bookstore;

import kg.alatoo.bookstore.entities.Book;

import java.util.List;

public interface BookService {

    Book updateBook(Long id, Book book);

    Book addBook(Book book);

    List<Book> getBooks();

    List<Book> getBooksByAuthor(String author);

    Book getBookById(long id);
}
