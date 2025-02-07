package kg.alatoo.bookstore.entities;

import lombok.*;

@Builder
@ToString
public class Book {

    private long id;
    private String title;
    private String description;

    private String author;
    private String isbn;


}
