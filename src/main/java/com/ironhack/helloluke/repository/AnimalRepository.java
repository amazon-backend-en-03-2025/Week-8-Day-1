package com.ironhack.helloluke.repository;

import com.ironhack.helloluke.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
