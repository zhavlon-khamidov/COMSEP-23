package kg.alatoo.myfirstapi.bootstrap;

import kg.alatoo.myfirstapi.entities.Student;
import kg.alatoo.myfirstapi.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {

    private final StudentRepository studentRepository;


    public DataInit(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Add some students to DB
        Student student1 = new Student("Anzhelika", "Zhalynbekova");
        Student student2 = new Student("Azhar", "Asankulova");
        Student student3 = new Student("Alym", "Yrysmamatov");

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

    }
}
