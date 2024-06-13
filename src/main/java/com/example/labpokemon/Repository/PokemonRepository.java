package com.example.labpokemon.Repository;

import com.example.labpokemon.Entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {


}
