package com.bellis.headfirst.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }
    private void doThis(){
        System.out.println("do this method!");
    }
    public void doingThis(){
        doThis();
    }
    @Override
    public double cost() {
        return .89;
    }


}
