package com.galvanize.gc.heros.controller;

import com.galvanize.gc.heros.model.Villain;
import com.galvanize.gc.heros.service.VillainService;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class VillainController {

    private VillainService villainService;

    public VillainController(VillainService villainService) {
        this.villainService = villainService;
    }

    @GetMapping("/api/villains")
    public List<Villain> getAllVillains() {
        return villainService.getAllVillains();
    }

    @GetMapping("/api/villains/{heroName}")
    public Villain getVillainByHeroName(@PathVariable String heroName) throws NotFoundException {
        Optional<Villain> villain = villainService.getVillainByHeroName(heroName);
        if(villain.isPresent()){
            return villain.get();
        }
        throw new NotFoundException("Villain with name " + heroName + " not found.");
    }



}
