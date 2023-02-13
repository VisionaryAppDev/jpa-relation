package com.example.demo.one_to_one_unidirectional_inversion.repository;

import com.example.demo.one_to_one_unidirectional_inversion.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CitizenRepository extends JpaRepository<Citizen, UUID> {
}
