package com.example.demo.many_to_many.repository;

import com.example.demo.many_to_many.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
