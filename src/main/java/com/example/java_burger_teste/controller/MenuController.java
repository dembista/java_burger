package com.example.java_burger_teste.controller;

import com.example.java_burger_teste.models.Burger;
import com.example.java_burger_teste.models.Menu;
import com.example.java_burger_teste.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/catalogue")
    public String getViewAllBurger(Model model) {
        List<Burger> burgers = menuService.getBurgerList();
        model.addAttribute("burgers", burgers);
        return "index";
    }

    //Ajouter burger
    @GetMapping("/burger-add")
    public String getViewAddBurger(Model model) {
        Burger burger = new Burger();

        model.addAttribute("burger", burger);
        return "catalogue/categorie-add";
    }

    //Post mapping
    @PostMapping("/burger-add")
    public String ajouterBurger(@ModelAttribute("burger") Burger burger, Model model) {
        if(burger == null || burger.getNom() == null || burger.getNom().equals("")) {
            model.addAttribute("errorNom", "Champ obligatoire");
            return "categorie/categorie-add";
        }
        menuService.ajoutBurger(burger);
        if (burger.getId() != null) {
            return "redirect:/burger-add";
        } else {
            model.addAttribute("error", "Echec de l'operation");
            return "catalogue/categorie-add";
        }

    }
}
