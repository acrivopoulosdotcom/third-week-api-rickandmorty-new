package com.example.thirdweekapirickandmortynew;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rickandmarty")
@RequiredArgsConstructor
public class FilmController {
    private final FilmService service;

    @GetMapping
    FilmCharacter getFilmCharacter(){
        return service.getFilmCharacter();
    }
}