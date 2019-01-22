package com.yiyun._2_observer;

import org.junit.Test;

public class TestObserver {

    @Test
    public void fun(){
        WeatherData weatherData=new WeatherData();
        CurrentConditions currentConditions=new CurrentConditions(weatherData);
        weatherData.setMeasurement(80,90,70);

    }
}
