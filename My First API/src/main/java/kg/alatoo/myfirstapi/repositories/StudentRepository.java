package kg.alatoo.myfirstapi.repositories;

import kg.alatoo.myfirstapi.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
