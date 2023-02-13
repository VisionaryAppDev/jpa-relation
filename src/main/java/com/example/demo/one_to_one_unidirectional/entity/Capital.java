package com.example.demo.one_to_one_unidirectional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Capital {
    @Id
    private UUID id;
    private String name;

    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
