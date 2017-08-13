package me.ramon.springbootredis.restcontrollers;

import me.ramon.springbootredis.domain.Student;
import me.ramon.springbootredis.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mojtaba on 8/13/2017.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    @ResponseBody
    public Student post(@RequestBody Student student) {
        studentRepository.save(student);
        return student;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Student get(@PathVariable("id") int id) {
        Student student = studentRepository.findOne(id);
        return student;
    }

    @ResponseBody
    @GetMapping
    public Iterable<Student> get() {
        Iterable<Student> students = studentRepository.findAll();
        return students;
    }
}
