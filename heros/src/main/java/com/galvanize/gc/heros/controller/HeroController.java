package com.galvanize.gc.heros.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.gc.heros.model.Hero;
import com.galvanize.gc.heros.repository.HeroRepository;
import com.galvanize.gc.heros.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroController {

    HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("/api/heroes")
    public List<Hero> getAllHeroes() throws JsonProcessingException {
        return heroService.getAllHeroes();
    }

    @PostMapping("/api/heroes")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Hero> createHeros(@RequestBody List<Hero> heroes){
        return heroService.createHeros(heroes);
    }
}
