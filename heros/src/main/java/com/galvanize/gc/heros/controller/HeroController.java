package com.galvanize.gc.heros.controller;

import com.galvanize.gc.heros.model.Hero;
import com.galvanize.gc.heros.service.HeroService;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HeroController {

    HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("/api/heroes")
    public List<Hero> getAllHeroes()  {
        return heroService.getAllHeroes();
    }

    @PostMapping("/api/heroes")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Hero> createHeroes(@RequestBody List<Hero> heroes) {
        return heroService.createHeros(heroes);
    }

    @GetMapping("/api/heroes/{heroName}")
    public Hero getHeroByHeroName(@PathVariable String heroName) throws NotFoundException {

        Optional<Hero> herooptional = heroService.getHeroByHeroName(heroName);
        if(herooptional.isPresent()){
            return herooptional.get();
        }
        throw new NotFoundException("Requested hero is not available");
    }

}
