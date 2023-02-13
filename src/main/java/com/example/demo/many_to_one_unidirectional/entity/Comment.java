package com.example.demo.many_to_one_unidirectional.entity;

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
public class Comment {
    @Id
    private UUID id;
    private String content;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
}
