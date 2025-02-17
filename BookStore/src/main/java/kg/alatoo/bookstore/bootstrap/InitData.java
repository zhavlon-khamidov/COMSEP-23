package kg.alatoo.bookstore.bootstrap;

import jakarta.annotation.PostConstruct;
import kg.alatoo.bookstore.entities.Author;
import kg.alatoo.bookstore.entities.Book;
import kg.alatoo.bookstore.entities.Publisher;
import kg.alatoo.bookstore.repositories.AuthorRepository;
import kg.alatoo.bookstore.repositories.BookRepository;
import kg.alatoo.bookstore.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {

    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;

    @PostConstruct
    public void init() {
        Publisher alatooBookstore = Publisher.builder()
                .name("Alatoo Bookstore")
                .address("Ankara 1/8")
                .build();

        Publisher anotherBookstore = Publisher.builder()
                .name("Another Bookstore")
                .address("Ankara 1/7")
                .build();

        Author altynai = Author.builder()
                .firstName("Altynai")
                .lastName("Munduzbaeva")
                .build();
        Author alexandra = Author.builder()
                .firstName("Alexandra")
                .lastName("Arykova")
                .build();

        Book book1 = Book.builder()
                .title("Book 1")
                .isbn("ISBN 1")
                .description("Book 1")
                .publisher(alatooBookstore)
                .authors(List.of(altynai))
                .build();

        Book book2 = Book.builder()
                .title("Book 2")
                .isbn("ISBN 2")
                .description("Book 2")
                .publisher(anotherBookstore)
                .authors(List.of(alexandra))
                .build();

        Book book3 = Book.builder()
                .title("Book 3")
                .isbn("ISBN 3")
                .description("Book 3")
                .publisher(alatooBookstore)
                .authors(List.of(alexandra, altynai))
                .build();

        publisherRepository.save(alatooBookstore);
        publisherRepository.save(anotherBookstore);

        authorRepository.save(altynai);
        authorRepository.save(alexandra);

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);

    }
}
