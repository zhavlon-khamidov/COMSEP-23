package kg.alatoo.bookstore.repositories;

import kg.alatoo.bookstore.entities.Author;
import kg.alatoo.bookstore.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long>, PagingAndSortingRepository<Book, Long> {

    List<Book> findAllByAuthorsContains(List<Author> authors);

}
