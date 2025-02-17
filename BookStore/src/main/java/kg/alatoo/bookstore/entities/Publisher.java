package kg.alatoo.bookstore.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
}
