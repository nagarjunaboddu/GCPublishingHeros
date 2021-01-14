package com.galvanize.gc.heros.repository;

import com.galvanize.gc.heros.model.Villain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VillainRepository extends JpaRepository<Villain, Integer> {
    Optional<Villain> findByHeroName(String heroName);
}
