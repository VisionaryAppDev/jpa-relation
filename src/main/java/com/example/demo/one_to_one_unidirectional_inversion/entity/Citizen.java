package com.example.demo.one_to_one_unidirectional_inversion.entity;

import jakarta.persistence.*;
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
public class Citizen {
    @Id
    private UUID id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "citizen_passport",
            joinColumns = @JoinColumn(name = "citizen_id"),
            inverseJoinColumns = @JoinColumn(name = "passport_id")
    )
    private Passport passport;
}
