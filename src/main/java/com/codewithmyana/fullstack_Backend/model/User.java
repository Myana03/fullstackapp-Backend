package com.codewithmyana.fullstack_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
// @Table(name = "users") // Optional: maps the entity to the 'users' table
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use appropriate strategy
    private Long id;

    private String name;

    private String email;

    private String username;

}
