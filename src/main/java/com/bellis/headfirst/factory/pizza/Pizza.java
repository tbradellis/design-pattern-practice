package com.bellis.headfirst.factory.pizza;

import com.bellis.headfirst.factory.ingredients.*;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;
    Pepperoni pepporoni;
    Brisket brisket;
    Veggies[] veggies;

    public abstract void prepare();

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
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "blah";
    }

}
