package kg.alatoo.bookstore.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PublisherDto {
    private Long id;
    private String name;
    private String address;
}
