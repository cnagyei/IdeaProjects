package com.calbert.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PizzaController {

    private final List<Pizza> pizzaList;

    Pizza pizza1 = new Pizza("Margherita", 50);
    Pizza pizza2 = new Pizza("Cheese", 30);
    Pizza pizza3 = new Pizza("Pepperoni", 20);
    Pizza pizza5 = new Pizza("Napoletana", 100);
    Pizza pizza6 = new Pizza("Calzone", 7.5);

    public PizzaController() {
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(pizza1);
        pizzaList.add(pizza2);
        pizzaList.add(pizza3);
        pizzaList.add(pizza5);
        pizzaList.add(pizza6);

        this.pizzaList = pizzaList;
    }




    @GetMapping("/home")
    public String home(Model model) { // Model acts as a container for the data to be passed from controller to HTML template
        model.addAttribute("pizzas", pizzaList); // Add the data to the model container
        return "menu"; // After adding data to model, locate and render the template file named menu
    }
}
