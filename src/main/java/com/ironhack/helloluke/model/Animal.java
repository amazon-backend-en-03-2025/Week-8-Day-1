package com.ironhack.helloluke.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Embedded
    private OriginArea originArea;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "areaName", column = @Column(name = "secondary_area_name")),
            @AttributeOverride(name = "continent", column = @Column(name = "secondary_area_continent"))
    })
    private OriginArea secondaryArea;

    public Animal(String name, OriginArea originArea) {
        this.name = name;
        this.originArea = originArea;
    }

    public Animal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
