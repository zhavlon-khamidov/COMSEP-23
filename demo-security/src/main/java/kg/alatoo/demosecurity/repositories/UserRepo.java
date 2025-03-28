package kg.alatoo.demosecurity.repositories;

import kg.alatoo.demosecurity.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {
    Optional<User> getUsersByUsername(String username);
}
