package com.example.demo.one_to_one_bidirectional.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Employee {
    @Id
    private UUID id;
    private String name;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private Address address;

    public Employee(UUID id) {
        this.id = id;
    }

}
