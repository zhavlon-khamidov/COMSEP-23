package kg.alatoo.bookstore.mappers;

import kg.alatoo.bookstore.dto.BookListDto;
import kg.alatoo.bookstore.entities.Author;
import kg.alatoo.bookstore.entities.Book;
import kg.alatoo.bookstore.entities.Publisher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public abstract class BookMapstructMapper {

    public  abstract BookListDto bookToBookListDto(Book book);

    public  abstract List<BookListDto> booksToBookListDtos(List<Book> books);

    protected String authorToString(Author author) {
        return author.getFirstName() + " " + author.getLastName();
    }

    protected String publisherToString(Publisher publisher) {
        return publisher.getName();
    }


}
