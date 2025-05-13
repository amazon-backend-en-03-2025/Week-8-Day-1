package com.ironhack.helloluke.model;

import jakarta.persistence.Entity;

@Entity
public class Bat extends Animal{

    private String favoriteCave;

    public Bat(String name, String favoriteCave, OriginArea originArea) {
        super(name, originArea);
        this.favoriteCave = favoriteCave;
    }

    public Bat() {
    }

    public String getFavoriteCave() {
        return favoriteCave;
    }

    public void setFavoriteCave(String favoriteCave) {
        this.favoriteCave = favoriteCave;
    }
}
