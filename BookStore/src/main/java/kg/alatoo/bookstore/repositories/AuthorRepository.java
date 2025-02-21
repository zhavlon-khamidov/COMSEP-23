package kg.alatoo.bookstore.repositories;

import kg.alatoo.bookstore.entities.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> getAuthorsByFirstNameOrLastName(String firstName, String lastName);
}
