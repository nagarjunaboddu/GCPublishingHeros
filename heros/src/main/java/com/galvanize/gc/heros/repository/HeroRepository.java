package com.galvanize.gc.heros.repository;

import com.galvanize.gc.heros.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Integer> {
}
