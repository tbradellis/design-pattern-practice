package com.bellis.headfirst.decorator;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
    public Size getSize(){
        return this.beverage.getSize();
    }

    @Override
    public double cost() {
        return this.beverage.cost();
    }
}
