package com.example.demo.one_to_many_bidirectional.repository;

import com.example.demo.one_to_many_bidirectional.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FeedbackRepository extends JpaRepository<Feedback, UUID> {
}
