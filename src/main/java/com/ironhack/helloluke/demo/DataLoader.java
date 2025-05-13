package com.ironhack.helloluke.demo;

import com.ironhack.helloluke.model.Animal;
import com.ironhack.helloluke.model.Bat;
import com.ironhack.helloluke.model.OriginArea;
import com.ironhack.helloluke.model.Turtle;
import com.ironhack.helloluke.repository.AnimalRepository;
import com.ironhack.helloluke.repository.BatRepository;
import com.ironhack.helloluke.repository.TurtleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final AnimalRepository animalRepository;
    private final BatRepository batRepository;
    private final TurtleRepository turtleRepository;

    public DataLoader(AnimalRepository animalRepository, BatRepository batRepository, TurtleRepository turtleRepository) {
        this.animalRepository = animalRepository;
        this.batRepository = batRepository;
        this.turtleRepository = turtleRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Loading data...");


        var originArea1 = new OriginArea("El Yunke - PR", "Caribbean");
        var originArea2 = new OriginArea("Yosemite - CA", "North America");
        var originArea3 = new OriginArea("Galapagos - Ecuador", "South America");
        var originArea4 = new OriginArea("Amazon - Brazil", "South America");


        var bat1 = new Bat("Batty", "Brown", originArea1);
        var bat2 = new Bat("Batty2", "Black", originArea2);

        var animal1 = new Animal("Animal1", originArea3);
        var animal2 = new Animal("Animal2", originArea4);

        var turtle1 = new Turtle("Turtly", "Green", originArea3);
        var turtle2 = new Turtle("Turtly2", "Blue",  originArea4);

        batRepository.save(bat1);
        batRepository.save(bat2);
        animalRepository.save(animal1);
        animalRepository.save(animal2);
        turtleRepository.save(turtle1);
        turtleRepository.save(turtle2);

        System.out.println("Data loaded");

    }
}
