package com.example.demo.many_to_many_unidirectional.repository;

import com.example.demo.many_to_many_unidirectional.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
}
