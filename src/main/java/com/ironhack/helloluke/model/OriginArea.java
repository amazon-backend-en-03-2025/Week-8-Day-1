package com.ironhack.helloluke.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class OriginArea {

    private String areaName;
    private String continent;

    public OriginArea(String name, String continent) {
        this.areaName = name;
        this.continent = continent;
    }

    public OriginArea() {
    }

    public String getName() {
        return areaName;
    }

    public void setName(String name) {
        this.areaName = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
