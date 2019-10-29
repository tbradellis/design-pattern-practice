package com.bellis.headfirst.factory;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing = " + name);
        System.out.println("Tossing dough = " + dough);
        System.out.println("sauce = " + sauce);
        for(String topping : toppings){
            System.out.println("  " + topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 2 minutes at 700." );
    }

    public void cut(){
        System.out.println("Cuttin' it up!");
    }

    public void box(){
        System.out.println("Place in official Za box");
    }
    public String getName(){
        return name;
    }

}
