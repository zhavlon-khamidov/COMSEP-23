package kg.alatoo.bookstore.services;

import kg.alatoo.bookstore.entities.Book;
import kg.alatoo.bookstore.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Primary
public class DatabaseBookService implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book updateBook(Long id, Book book) {
        return null;
    }

    @Override
    public Book addBook(Book book) {
        book.setId(null);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return List.of();
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return List.of();
    }

    @Override
    public Book getBookById(long id) {
        return null;
    }
}
