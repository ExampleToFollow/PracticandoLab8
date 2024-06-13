package com.example.labpokemon.Controller;

import com.example.labpokemon.Daos.PokemonDao;
import com.example.labpokemon.Repository.PokemonRepository;
import com.example.labpokemon.Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;

@Controller
public class HomeController {

    private final PokemonDao pokemonDao ;
    private final PokemonRepository pokemonRepository;
    private final UserRepository userRepository ;

    public HomeController(PokemonDao pokemonDao,PokemonRepository pokemonRepository,  UserRepository userRepository){
        this.pokemonDao = pokemonDao;
        this.pokemonRepository = pokemonRepository;
        this.userRepository = userRepository;
    }
    //Pregunta 1
    @GetMapping(value="/locationArea")
    public Object getPokemonLocationArea(@RequestParam("pokemon") String pokemon){
        LinkedHashMap<String , Object>  response =  new LinkedHashMap<String,Object>();


    }

    //Pregunta 2

    //Pregunta 3

}
