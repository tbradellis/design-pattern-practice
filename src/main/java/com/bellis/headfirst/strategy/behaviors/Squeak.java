package com.bellis.headfirst.strategy.behaviors;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeakers");
    }
}
