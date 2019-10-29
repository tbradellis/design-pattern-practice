package com.bellis.headfirst.factory;

public class Application {

    public static void main(String[] args) {

        PizzaStore zaStoreJoel = new ChicagoPizzaStore();
        PizzaStore zaStoreEthan = new NYPizzaStore();

        Pizza jza = zaStoreJoel.orderPizza("cheese");
        System.out.println("Joel ordered a " + jza.getName());
        System.out.println("--------Next Pizza----------");
        Pizza eza = zaStoreEthan.orderPizza("cheese");
        System.out.println("Ethan ordered a " + eza.getName());


    }
}
