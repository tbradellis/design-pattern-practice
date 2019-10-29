package com.bellis.headfirst.observerpattern.juobserver;

import com.bellis.headfirst.observerpattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionDisplay(Observable o){
        this.observable = o;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(temperature + "F and " + humidity + "% humidity");
    }
}
