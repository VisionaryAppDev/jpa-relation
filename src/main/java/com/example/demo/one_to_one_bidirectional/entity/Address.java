package com.example.demo.one_to_one_bidirectional.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
public class Address {
    @Id
    private UUID id;
    private String location;

    @JsonIgnore /// You must add this one to avoid loop when response directly to client bcz Jackson will try to expand object indefinitely and cause issue.
    // By adding this line, no more error when response to client. While access Address.GetEmployee() object is still possible from Java code or through DTO
    @OneToOne

//    create table Address(
//        id UUID primary key,
//        location VARCHAR(100) not null,
//
//        --- This relation is crucial for the JPA
//        employee_id UUID not NULL,
//        FOREIGN KEY (employee_id) REFERENCES employee(id)
//    );
/// This like is like => FOREIGN KEY (employee_id) REFERENCES employee(id)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

}
