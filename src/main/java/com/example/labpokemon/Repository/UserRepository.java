package com.example.labpokemon.Repository;

import com.example.labpokemon.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {



}
