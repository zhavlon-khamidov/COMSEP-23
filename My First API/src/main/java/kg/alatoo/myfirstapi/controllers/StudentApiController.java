package kg.alatoo.myfirstapi.controllers;

import kg.alatoo.myfirstapi.entities.Student;
import kg.alatoo.myfirstapi.repositories.StudentRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentApiController {

    private final StudentRepository studentRepository;

    public StudentApiController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping()
    public Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable("id") int studentId){
        return studentRepository.findById(studentId).orElseThrow();
    }


    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("{id}")
    public Student updateStudent(){
        return null;
    }


    @DeleteMapping("{id}")
    public Student deleteStudent(){
        return null;
    }

}
