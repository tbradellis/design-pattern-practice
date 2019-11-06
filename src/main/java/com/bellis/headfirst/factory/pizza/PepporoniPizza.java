package com.bellis.headfirst.factory.pizza;

import com.bellis.headfirst.factory.ingredients.PizzaIngredientFactory;
import sun.rmi.server.InactiveGroupException;

public class PepporoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepporoniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {

        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.pepporoni = ingredientFactory.createPepporoni();

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
