package com.example.demo.many_to_one_unidirectional.repository;

import com.example.demo.many_to_one_unidirectional.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
}
