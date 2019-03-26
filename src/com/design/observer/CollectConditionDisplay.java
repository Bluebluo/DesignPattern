package com.design.observer;

/**
 * @program: DesignPattern
 * @description: 其他公告板
 * @author: Li Hongmou
 * @create: 2019-03-26 17:24
 **/
public class CollectConditionDisplay implements Observer, DisplayElement {
    private float temp, humidity, pressure;

    public CollectConditionDisplay(Subject o){
        o.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("我想把他们加起来"+ (humidity + temp + pressure));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
