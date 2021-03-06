package com.galvanize.gc.heros.service;

import com.galvanize.gc.heros.model.Villain;
import com.galvanize.gc.heros.repository.VillainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VillainService {
    @Autowired
    VillainRepository villainRepository;

    public List<Villain> getAllVillains(){
        return villainRepository.findAll();
    }

    public Optional<Villain> getVillainByHeroName(String heroName)
    {
        return villainRepository.findByHeroName(heroName);
    }
}
