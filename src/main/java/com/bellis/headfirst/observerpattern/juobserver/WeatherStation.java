package com.bellis.headfirst.observerpattern.juobserver;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData data = new WeatherData();
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(data);
        data.setMeasurements(10, 45, 33);
        ccd.update(data, null);
    }
}
