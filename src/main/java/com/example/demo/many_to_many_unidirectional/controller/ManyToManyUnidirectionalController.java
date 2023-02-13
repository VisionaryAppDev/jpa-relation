package com.example.demo.many_to_many.controller;

import com.example.demo.many_to_many.entity.Course;
import com.example.demo.many_to_many.entity.Student;
import com.example.demo.many_to_many.repository.CourseRepository;
import com.example.demo.many_to_many.repository.StudentRepository;
import com.example.demo.one_to_many_bidirectional.entity.Feedback;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class ManyToManyController {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> orders() {
        return studentRepository.findAll();
    }


    @PostMapping("/courses")
    public List<Course> saveCourse(@RequestBody List<Course> courses) {
        return courseRepository.saveAll(courses);
    }

    @GetMapping("/courses")
    public List<Course> feedback() {
        return courseRepository.findAll();
    }

}
