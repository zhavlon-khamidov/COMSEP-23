package kg.alatoo.bookstore.mappers;

import kg.alatoo.bookstore.dto.PublisherDto;
import kg.alatoo.bookstore.entities.Publisher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PublisherMapper {

    PublisherDto toDto(Publisher publisher );
    Publisher toEntity(PublisherDto publisherDto);

    List<PublisherDto> toDto(List<Publisher> publishers);
    List<Publisher> toEntities(List<PublisherDto> publisherDtos);
}
