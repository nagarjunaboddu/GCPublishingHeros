package com.galvanize.gc.heros.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Favorite {

    @Id
    @GeneratedValue
    private int id;

    public Favorite() {
    }

    private String heroName;

    public Favorite(String heroName) {
        this.heroName = heroName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "id=" + id +
                ", heroName='" + heroName + '\'' +
                '}';
    }

}
