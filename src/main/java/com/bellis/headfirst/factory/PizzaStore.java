package com.bellis.headfirst.factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza za = createPizza(type);

        za.prepare();
        za.bake();
        za.cut();
        za.box();

        return za;
    }
    protected abstract Pizza createPizza(String item);

}
