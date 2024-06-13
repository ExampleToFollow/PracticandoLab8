package com.example.labpokemon.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user", schema = "lewislab")
public class User {
    @Id
    @Column(name = "iduser", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

}