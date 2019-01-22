package com.yiyun._2_observer;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humid;
    private float pressure;

    public void measureChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurement(float temperature,float humid,float pressure){
        this.temperature=temperature;
        this.humid=humid;
        this.pressure=pressure;
        measureChanged();
    }
    public float getTemperature() {
        return temperature;
    }

    public float getHumid() {
        return humid;
    }

    public float getPressure() {
        return pressure;
    }
}
