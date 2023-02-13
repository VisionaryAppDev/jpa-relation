package com.example.demo.one_to_one_unidirectional_inversion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Passport {
    @Id
    private UUID id;
    private String passportNo;
}
