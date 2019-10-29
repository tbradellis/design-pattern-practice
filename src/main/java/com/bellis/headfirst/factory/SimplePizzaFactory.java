package com.bellis.headfirst.factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza za=null;
        switch (type) {
            case "cheese":
                return new CheesePizza();


        }
        return za;
    }
}
