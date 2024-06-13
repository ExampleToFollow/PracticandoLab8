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
@Table(name = "pokemon", schema = "lewislab")
public class Pokemon {
    @Id
    @Column(name = "idpokemon", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "location", nullable = false, length = 45)
    private String location;

    @Column(name = "probability", nullable = false, length = 45)
    private String probability;

}