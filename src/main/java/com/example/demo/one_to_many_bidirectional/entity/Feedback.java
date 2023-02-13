package com.example.demo.one_to_many_bidirectional.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Feedback {

    @Id
    private UUID id;
    private String comment;

    @JsonIgnore
    /// You must add this one to avoid loop when response directly to client bcz Jackson will try to expand object indefinitely and cause issue.
    // By adding this line, no more error when response to client. While access Address.GetEmployee() object is still possible from Java code or through DTO
    /// But not sure if FetchType.LAZY has the same effect as JsonIgnore?
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
}