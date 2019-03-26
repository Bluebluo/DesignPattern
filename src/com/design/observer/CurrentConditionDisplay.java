package com.design.observer;

import java.util.Date;

/**
 * @program: DesignPattern
 * @description: 公布板显示信息,观察者
 * @author: Li Hongmou
 * @create: 2019-03-26 17:13
 **/
public class CurrentConditionDisplay implements DisplayElement, Observer{
    private float temp, humidity, pressure;

    public CurrentConditionDisplay(Subject weather){
        weather.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(new Date().getTime() + " temp: " + temp + " humidity: " +humidity + " pressure: "+ pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
