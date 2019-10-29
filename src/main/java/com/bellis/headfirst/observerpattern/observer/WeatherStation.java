package com.bellis.headfirst.observerpattern.observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(72, 23, 30);
        weatherData.setMeasurements(73, 25, 30);
        weatherData.setMeasurements(80, 21, 30);

    }

}
