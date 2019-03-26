package com.design.observer;

import java.util.ArrayList;

/**
 * @program: DesignPattern
 * @description: 天气站
 * @author: Li Hongmou
 * @create: 2019-03-26 17:02
 **/
public class WeatherData implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();
    private float temp, humidity, pressure;
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void measureChanged(){
        notifyObserver();
    }

    public void mesaureData(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measureChanged();
    }

}
