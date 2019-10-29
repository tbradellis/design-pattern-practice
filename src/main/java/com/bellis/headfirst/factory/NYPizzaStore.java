package com.bellis.headfirst.factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza za = null;
        switch (item) {
            case "cheese":
                return new NYCheesePizza();
            case "veggie":
                return new NYVeggie();
            case "clam":
                return new NYClam();
            case "pepporoni":
                return new NYPepporoni();
            default:
                return null;
        }
    }
}
