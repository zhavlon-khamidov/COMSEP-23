package kg.alatoo.bookstore.bootstrap;

import kg.alatoo.bookstore.entities.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class InitComponent implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("Init method started");
//        System.out.println("--------------------------------------");

//        Book book = new Book(1, "hello");
        log.info("Initializing BookStore...");
        Book book = Book.builder()
                .id(1L)
                .title("Title")
                .isbn("153243241531")
                .description("lsjdfljsldjf lajsdfajsdlfkj laksdj")
                .build();

//        System.out.println(book);
        log.info(book.toString());

        log.debug("Bookstore debug");
        log.warn("Bookstore warning...");
        log.error("Bookstore error...");



//        System.out.println("--------------------------------------");
//        System.out.println("Init method ended");
    }
}
