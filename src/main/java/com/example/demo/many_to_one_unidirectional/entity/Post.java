package com.example.demo.many_to_one_unidirectional.entity;

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
public class Post {

    @Id
    private UUID id;
    private String title;
}
