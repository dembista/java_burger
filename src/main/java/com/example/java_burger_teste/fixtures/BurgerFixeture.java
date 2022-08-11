package com.example.java_burger_teste.fixtures;

import com.example.java_burger_teste.models.Burger;
import com.example.java_burger_teste.models.TypeEtat;
import com.example.java_burger_teste.services.MenuService;
import org.springframework.stereotype.Component;

@Component
public class BurgerFixeture {
    private MenuService ms;

    public void load() {
        Burger burger = new Burger();

        burger.setDescription("fdqvdgchdv");
        burger.setNom("Burger thease");

        ms.ajoutBurger(burger);
    }
}
