package com.example.demo.one_to_one_unidirectional.repository;

import com.example.demo.one_to_one_unidirectional.entity.Capital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CapitalRepository extends JpaRepository<Capital, UUID> {
}
