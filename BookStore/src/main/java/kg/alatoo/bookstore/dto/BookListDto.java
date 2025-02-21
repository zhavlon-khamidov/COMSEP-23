package kg.alatoo.bookstore.dto;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
public class BookListDto {
    private Long id;
    private String title;
    private List<String> authors;
    private String publisher;
    private String isbn;
}
