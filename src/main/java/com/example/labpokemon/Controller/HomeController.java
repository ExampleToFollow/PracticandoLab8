package com.example.labpokemon.Controller;

import com.example.labpokemon.Daos.PokemonDao;
import com.example.labpokemon.Repository.PokemonRepository;
import com.example.labpokemon.Repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
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
    //Pregunta 1 Encontrar lugares de los pokemones
    //https://pokeapi.co/api/v2/pokemon/{id or name}/encounters
    @GetMapping(value="/locationArea")
    public Object getPokemonLocationArea(@RequestParam("pokemon") String pokemon){
        LinkedHashMap<String , Object>  response =  new LinkedHashMap<String,Object>();
        try {
            if (! ((ArrayList<String>)(pokemonDao.buscarLugaresPokemones(pokemon))).isEmpty()){
                ArrayList<String> listaLugares = (ArrayList<String>) (pokemonDao.buscarLugaresPokemones(pokemon));
                ArrayList<LinkedHashMap<String,Object>> data = new ArrayList<>();
                for(String nombreLugar:listaLugares){
                    LinkedHashMap<String,Object>informacionLugar=new LinkedHashMap<>();
                    informacionLugar.put("nombre",nombreLugar);
                    data.add(informacionLugar);
                }
                response.put("Contenido" , data);
                return ResponseEntity.ok(response);
            }else{
                System.out.println("No se encontro el pokemon");
                LinkedHashMap<String, Object> resp = new LinkedHashMap<String, Object>();
                resp.put("Error", "No se encontro el pokemon");
                resp.put("Date", "" + LocalDateTime.now());
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
            }
        }catch(Exception err) {
            LinkedHashMap<String, Object> resp = new LinkedHashMap<String, Object>();
            resp.put("Error", "ocurrio un error inesperado");
            resp.put("Date", "" + LocalDateTime.now());
            return ResponseEntity.badRequest().body(resp);
        }
    }
    //Pregunta 2

    //Pregunta 3

}
