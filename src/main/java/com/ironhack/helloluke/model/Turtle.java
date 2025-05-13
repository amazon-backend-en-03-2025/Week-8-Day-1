package com.ironhack.helloluke.model;

import jakarta.persistence.Entity;

@Entity
public class Turtle extends Animal{

    private String shellColor;

    public Turtle(String name, String shellColor, OriginArea originArea) {
        super(name, originArea);
        this.shellColor = shellColor;
    }

    public Turtle() {
    }

    public String getShellColor() {
        return shellColor;
    }

    public void setShellColor(String shellColor) {
        this.shellColor = shellColor;
    }
}
