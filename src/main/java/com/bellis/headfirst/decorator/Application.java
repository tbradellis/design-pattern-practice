package com.bellis.headfirst.decorator;

public class Application {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ": $" + espresso.cost());
        //note the recursive composition aspect of the decorator pattern. Kinda cool.
        Beverage beverage = new DarkRoast();

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());


        Beverage beverage1 = new HouseBlend();
        ((HouseBlend) beverage1).doingThis();

        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + ": $" + beverage1.cost());

    }
}
