package com.galvanize.gc.heros.controller;

import com.galvanize.gc.heros.model.Villain;
import com.galvanize.gc.heros.service.VillainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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
    public Villain getVillainByHeroName(@PathVariable String heroName) {
        return villainService.getVillainByHeroName(heroName);
    }

}
