package com.galvanize.gc.heros.repository;

import com.galvanize.gc.heros.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FanRepository extends JpaRepository<Favorite,Integer> {
    Optional<Favorite> findByHeroName(String heroName);
}
