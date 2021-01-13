package com.galvanize.gc.heros.service;

import com.galvanize.gc.heros.model.Hero;
import com.galvanize.gc.heros.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {
    @Autowired
    HeroRepository repository;

    public List<Hero> getAllHeroes() {
        return repository.findAll();
    }

    public List<Hero> createHeros(List<Hero> heroes) {
        return repository.saveAll(heroes);
    }
}
