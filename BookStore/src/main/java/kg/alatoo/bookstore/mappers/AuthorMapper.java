package kg.alatoo.bookstore.mappers;

import kg.alatoo.bookstore.dto.AuthorDto;
import kg.alatoo.bookstore.entities.Author;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AuthorMapper {

    AuthorDto toDto(Author author);
    Author toEntity(AuthorDto authorDto);

    List<Author> toEntities(List<AuthorDto> authorDtos);
    List<AuthorDto> toDtos(List<Author> authors);
}
