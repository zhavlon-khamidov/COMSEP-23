package kg.alatoo.bookstore.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Data
@Builder
@Entity
@Schema(description = "Book entity that has id, title, and description")
public class Book {

    @Id
    @GeneratedValue
    @Schema(description = "identical number of book in the system")
    private Long id;

    @NotNull(message = "title of book must be provided")
    @NotBlank(message = "title of book must not be blank")
//    @Size(min = 3, max = 20,
//            message = "Title must have at least 3 characters " +
//                    "and maximum 20 characters")
    @Column(nullable = false, length = 20)
    private String title;
    private String description;
//    private String author;
    private String isbn;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private List<Author> authors;


}

