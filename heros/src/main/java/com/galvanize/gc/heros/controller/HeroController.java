package com.galvanize.gc.heros.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.gc.heros.model.Hero;
import com.galvanize.gc.heros.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroController {


    private HeroRepository heroRepo;

    public HeroController(HeroRepository heroRepo) {
        this.heroRepo = heroRepo;
    }

    @GetMapping("/api/heroes")
    public List<Hero> getAllHeroes() throws JsonProcessingException {
        return heroRepo.findAll();
    }
}
