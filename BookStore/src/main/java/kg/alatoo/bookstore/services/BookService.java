package kg.alatoo.bookstore.services;

import kg.alatoo.bookstore.dto.BookListDto;
import kg.alatoo.bookstore.entities.Book;

import java.util.List;

public interface BookService {

    Book updateBook(Long id, Book book);

    Book addBook(Book book);

    List<BookListDto> getBooks();

    List<BookListDto> getBooksByAuthor(String author);

    Book getBookById(Long id);

    Book deleteBook(Long id);
}
