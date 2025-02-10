package kg.alatoo.bookstore.entities;

import lombok.*;

//@Getter
//@Setter
//@NoArgsConstructor
@RequiredArgsConstructor
//@EqualsAndHashCode
@Data
@Builder
@AllArgsConstructor
//@ToString
public class Book {

    private final long id;
    @NonNull
    private String title;
    private String description;

    private String author;
    private String isbn;


}
