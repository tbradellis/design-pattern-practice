package com.bellis.headfirst.strategy.duck;

import com.bellis.headfirst.strategy.behaviors.FlyBehavior;
import com.bellis.headfirst.strategy.behaviors.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(){

    }
    public abstract void display();

    //delegate the behavior that changes
    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("stroke, stroke");

    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }

}
