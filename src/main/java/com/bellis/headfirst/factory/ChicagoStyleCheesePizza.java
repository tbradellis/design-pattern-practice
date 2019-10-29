package com.bellis.headfirst.factory;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chi-Town Style Deep Dish Cheese ZA!";
        dough= "Extra Thick Crust";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded MOZZ!");
    }

    @Override
    public void cut(){
        System.out.println("Cutting into square slices.");
    }

}
