package com.example.labpokemon.Daos;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PokemonDao {
    public Object buscarDatosPorDNI(String pokemon ){
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Object> response = restTemplate.getForEntity(
                "https://api.apis.net.pe/v2/reniec/dni?numero="+dni+"&token=apis-token-8891.nCKic6UVmhldqck9sTCRzFbh2wGdR-dI", PersonaDni.class);
        return response.getBody();
    }

}
