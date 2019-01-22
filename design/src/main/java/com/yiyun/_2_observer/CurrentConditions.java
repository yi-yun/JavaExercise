package com.yiyun._2_observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer {
    Observable observable;
    private float temperature;
    private float humid;

    public CurrentConditions(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }



    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData ){
            WeatherData weatherData=(WeatherData)o;
            temperature=weatherData.getTemperature();
            humid=weatherData.getHumid();
            display();
        }
    }

    public void display(){
        System.out.println("temperature = " + temperature);
    }
}
