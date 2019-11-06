//package com.bellis.headfirst.strategy.application;
//
//import com.bellis.headfirst.strategy.behaviors.FlyRocketPowered;
//import com.bellis.headfirst.strategy.behaviors.MuteQuack;
//import com.bellis.headfirst.strategy.duck.Duck;
//import com.bellis.headfirst.strategy.duck.MallardDuck;
//import com.bellis.headfirst.strategy.duck.ModelDuck;
//import javafx.embed.swing.JFXPanel;
//
//public class Application {
//
//    public static void main(String[] args) {
//
//        JFXPanel panel = new JFXPanel();
//        Duck mallard = new MallardDuck();
//        mallard.display();
//        mallard.performQuack();
//        mallard.performQuack();
//        mallard.swim();
//        mallard.performFly();
//
//        Duck modelDuck = new ModelDuck();
//        modelDuck.performFly();
//        modelDuck.performQuack();
//        modelDuck.setFlyBehavior(new FlyRocketPowered());
//        modelDuck.performFly();
//        modelDuck.setQuackBehavior(new MuteQuack());
//        modelDuck.performQuack();
//    }
//}
