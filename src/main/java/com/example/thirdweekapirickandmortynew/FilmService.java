package com.example.thirdweekapirickandmortynew;

import org.springframework.http.ResponseEntity;
        import org.springframework.stereotype.Service;
        import org.springframework.web.reactive.function.client.WebClient;

@Service
public class FilmService {

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character");
    FilmCharacter getFilmCharacter() {
        ResponseEntity<FilmCharacter> responseEntity = webClient
                .get()
                .uri("/2")
                .retrieve()
                .toEntity(FilmCharacter.class)
                .block();

        return responseEntity.getBody();
    }
}