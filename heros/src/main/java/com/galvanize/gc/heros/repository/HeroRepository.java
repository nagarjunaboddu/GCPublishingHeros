package com.galvanize.gc.heros.repository;

import com.galvanize.gc.heros.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HeroRepository extends JpaRepository<Hero, Integer> {
    Optional<Hero> findByHeroName(String heroName);
}
