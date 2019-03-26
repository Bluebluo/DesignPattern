package com.design.observer;

/**
 * @program: DesignPattern
 * @description: 观察者对象
 * @author: Li Hongmou
 * @create: 2019-03-26 17:04
 **/
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
