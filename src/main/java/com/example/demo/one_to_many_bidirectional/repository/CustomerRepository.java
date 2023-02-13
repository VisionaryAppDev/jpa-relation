package com.example.demo.one_to_many_bidirectional.repository;

import com.example.demo.one_to_many_bidirectional.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
