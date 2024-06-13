package com.example.labpokemon.Daos;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

@Component
public class PokemonDao {
    public Object buscarLugaresPokemones(String pokemon ){
        RestTemplate restTemplate = new RestTemplate();
        //Usamos LinkedHashMap
        //LinkedHashMap<String, Object> data = new LinkedHashMap<String, Object>();
        //No sabemos la forma que tiene
        ResponseEntity<Object> response = restTemplate.getForEntity(
                "https://pokeapi.co/api/v2/pokemon/"+pokemon+"/encounters", Object.class);
        List<String> locations=new ArrayList<>();
        ArrayList<LinkedHashMap<String, Object>> lista =  (ArrayList<LinkedHashMap<String, Object>>)response.getBody();
        ArrayList<String> locationList = new ArrayList<String>();
        for(LinkedHashMap<String,Object> map: lista){
            LinkedHashMap<String,Object> aux = ((LinkedHashMap<String,Object>) map.get("location_area"));
            locationList.add(""+ aux.get("name"));
        }

        return locationList;
    }

}
