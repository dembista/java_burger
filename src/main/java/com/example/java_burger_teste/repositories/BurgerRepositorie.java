package com.example.java_burger_teste.repositories;

import com.example.java_burger_teste.models.Burger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepositorie extends JpaRepository<Burger, Long> {
}
