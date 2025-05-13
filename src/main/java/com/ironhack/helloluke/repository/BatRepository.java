package com.ironhack.helloluke.repository;

import com.ironhack.helloluke.model.Animal;
import com.ironhack.helloluke.model.Bat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatRepository extends JpaRepository<Bat, Long> {
}
