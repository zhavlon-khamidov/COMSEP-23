package kg.alatoo.bookstore.mappers;

import kg.alatoo.bookstore.dto.BookListDto;
import kg.alatoo.bookstore.entities.Book;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapperImpl implements BookMapper {
    @Override
    public BookListDto bookToBookListDto(Book book) {
        List<String> authors = book.getAuthors().stream()
                .map(a -> a.getFirstName() + " " + a.getLastName())
                .collect(Collectors.toList());

        return BookListDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .isbn(book.getIsbn())
                .publisher(book.getPublisher().getName())
                .authors(authors)
                .build();
    }
}
