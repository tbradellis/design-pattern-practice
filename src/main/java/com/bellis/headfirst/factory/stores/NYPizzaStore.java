package com.bellis.headfirst.factory.stores;

import com.bellis.headfirst.factory.ingredients.NYPizzaIngredientFactory;
import com.bellis.headfirst.factory.ingredients.PizzaIngredientFactory;
import com.bellis.headfirst.factory.pizza.*;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(){

    }
    @Override
    protected Pizza createPizza(String item) {
        String STYLE = "New York Style ";
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza za = null;
        switch (item){
            case "cheese":
                za = new CheesePizza(ingredientFactory);
                za.setName(STYLE + "Cheese Pizza");
                return za;
            case "veggie":
                za = new VeggiePizza(ingredientFactory);
                za.setName(STYLE + "Veggie Pizza");
                return za;
            case "Pepporoni":
                za =new PepporoniPizza(ingredientFactory);
                za.setName(STYLE + "Pepperoni Pizza");
                return za;
            case "clam":
                za = new ClamPizza(ingredientFactory);
                za.setName(STYLE + "Clam Pizza");
                return za;
            case "brisket":
                za = new BrisketPizza(ingredientFactory);
                za.setName(STYLE + "Brisket Pizza");
                return za;
            default:
                throw new IllegalArgumentException(item + " not a valid pizza type!");
        }
    }
}
