package com.bellis.headfirst.decorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }


    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                cost += .10;
            case VENTI:
                cost += .15;
            case GRANDE:
                cost += .20;
        }
        return cost;
    }

}
