package com.galvanize.gc.heros.controller;

import com.galvanize.gc.heros.model.Favorite;
import com.galvanize.gc.heros.repository.FanRepository;
import com.galvanize.gc.heros.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class FanController {

    @Autowired
    FanService fanService;

    @Autowired
    FanRepository fanRepository;

    @PostMapping(value = "/api/fan/favorites",produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public Favorite createFavourites(@RequestBody Favorite hero){
        Favorite favorite =  fanService.createFavorite(hero);
        return favorite;
    }

    @GetMapping("/api/fan/favorites")
    public List<Favorite> getAllHeroes()  {
        return fanRepository.findAll();
    }

    @DeleteMapping("/api/fan/favorites/{heroName}")
    public void removeHeroFromFavorites(@PathVariable String heroName){
        Optional<Favorite> optionalFavorite = fanRepository.findByHeroName(heroName);
        System.out.println(optionalFavorite.isPresent());
        if(optionalFavorite.isPresent()) {
            fanRepository.delete(new Favorite(heroName));
        }
    }

}
