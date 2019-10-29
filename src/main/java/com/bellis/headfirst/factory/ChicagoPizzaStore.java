package com.bellis.headfirst.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza za = null;
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoVeggie();
            case "clam":
                return new ChicagoClam();
            case "pepporoni":
                return new ChicagoPepperoni();
            default:
                return null;
        }

    }
}
