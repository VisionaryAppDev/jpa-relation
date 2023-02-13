package com.example.demo.one_to_many_unidirectional.repository;

import com.example.demo.one_to_many_unidirectional.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
