package com.example.demo.one_to_one_unidirectional.repository;

import com.example.demo.one_to_one_unidirectional.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CountryRepository extends JpaRepository<Country, UUID> {
}
