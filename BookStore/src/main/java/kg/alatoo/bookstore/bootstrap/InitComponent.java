package kg.alatoo.bookstore.bootstrap;

import kg.alatoo.bookstore.entities.Book;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitComponent implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Init method started");
        System.out.println("--------------------------------------");

        Book book = Book.builder()
                .id(1L)
                .title("Title")
                .isbn("153243241531")
                .description("lsjdfljsldjf lajsdfajsdlfkj laksdj")
                .build();

        System.out.println(book);

        System.out.println("--------------------------------------");
        System.out.println("Init method ended");
    }
}
