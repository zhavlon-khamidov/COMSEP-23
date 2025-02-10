package kg.alatoo.bookstore.controllers;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import kg.alatoo.bookstore.BookService;
import kg.alatoo.bookstore.entities.Book;
import kg.alatoo.bookstore.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/book/")
@RequiredArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book createdBook = bookService.addBook(book);

        /*return ResponseEntity
                .created(URI.create("/api/v1/book/" + createdBook.getId()))
                .header("foo", "bar")
                .build();*/

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Location",
                        "/api/v1/book/"+createdBook.getId().toString())
                .body(createdBook);
    }

    @PutMapping("{id}")
    public Book updateBook(@PathVariable long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    /*    @Setter(onMethod_ = @Value("${java.version}"))
    private String javaVersion;

    @Setter(onMethod_ = @Value("${my.text}"))
    private String myText;*/


/*    @PostConstruct
    public void init() {
        log.info("My text is {}", myText);
        log.info("Java version is {}", javaVersion);
    }*/


}
