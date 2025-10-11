package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {
    private final StudentRepository studentRepository;

    public FirstController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student post(
            @RequestBody
            Student student
    ){
        return studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{student-id}")
    public Student findStudentById(
            @PathVariable("student-id")
            Integer id
    ) {
        return studentRepository.findById(id).orElse(new Student());
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findStudentByName(
            @PathVariable("student-name")
            String name
    ) {
        return studentRepository.findByFirstnameContaining(name);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void DeleteStudentById(
            @PathVariable("student-id")
            Integer id
    ) {
        studentRepository.deleteById(id);
    }

}

