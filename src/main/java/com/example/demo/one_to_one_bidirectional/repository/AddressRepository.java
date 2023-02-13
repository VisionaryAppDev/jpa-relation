package com.example.demo.one_to_one_bidirectional.repository;

import com.example.demo.one_to_one_bidirectional.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
