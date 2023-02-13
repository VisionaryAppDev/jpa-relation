package com.example.demo.many_to_many_unidirectional.repository;

import com.example.demo.many_to_many_unidirectional.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
