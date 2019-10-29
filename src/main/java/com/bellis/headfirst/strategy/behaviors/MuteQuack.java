package com.bellis.headfirst.strategy.behaviors;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
