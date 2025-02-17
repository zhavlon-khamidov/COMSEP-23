package kg.alatoo.bookstore.configs;

import kg.alatoo.bookstore.bootstrap.InitData;
import kg.alatoo.bookstore.repositories.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    /*@Bean
    public InitData initData(BookRepository bookRepository) {
        InitData initData = new InitData();
        //you did some additional confs for initData object
        return initData;
    }*/
}
