package kg.alatoo.bookstore.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Data
@Builder
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String author;
    private String isbn;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private List<Author> authors;


}

