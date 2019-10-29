package com.bellis.headfirst.strategy.behaviors;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Swoosh, Swoosh!");
    }
}
