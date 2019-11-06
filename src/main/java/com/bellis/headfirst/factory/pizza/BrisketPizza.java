package com.bellis.headfirst.factory.pizza;

import com.bellis.headfirst.factory.ingredients.PizzaIngredientFactory;

public class BrisketPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public BrisketPizza(PizzaIngredientFactory ingredientFactory){

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        brisket = ingredientFactory.createBrisket();

    }
    @Override
    public void prepare() {

    }
}
