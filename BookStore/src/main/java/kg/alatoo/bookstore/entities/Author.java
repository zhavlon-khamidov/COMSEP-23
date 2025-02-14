package kg.alatoo.bookstore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Author {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;

}
