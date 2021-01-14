package com.galvanize.gc.heros.controller;

import com.galvanize.gc.heros.model.Villain;
import com.galvanize.gc.heros.repository.VillainRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.util.List;



@RestController
public class VillainController {

    private VillainRepository villainRepository;

    public VillainController(VillainRepository villainRepository) {
        this.villainRepository = villainRepository;
    }

    @GetMapping("/api/villains")
    public List<Villain> getAllVillains(){
        return villainRepository.findAll();
    }
}
