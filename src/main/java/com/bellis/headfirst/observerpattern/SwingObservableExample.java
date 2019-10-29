package com.bellis.headfirst.observerpattern;

import javax.swing.*;
import java.awt.*;

public class SwingObservableExample {


    JFrame frame;

    public static void main(String[] args) {
        SwingObservableExample example = new SwingObservableExample();
        example.go();

    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("do it!"));
        button.addActionListener(event -> System.out.println("you'll regret it!"));
        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);


    }






}
