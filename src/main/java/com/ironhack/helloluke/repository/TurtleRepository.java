package com.ironhack.helloluke.repository;

import com.ironhack.helloluke.model.Animal;
import com.ironhack.helloluke.model.Turtle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurtleRepository extends JpaRepository<Turtle, Long> {
}
