package com.design.observer;

/**
 * @program: DesignPattern
 * @description: 观察者模式test
 * @author: Li Hongmou
 * @create: 2019-03-26 17:02
 **/
public class ObserverTest {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay localDisplay = new CurrentConditionDisplay(weatherData);
        CollectConditionDisplay conditionDisplay = new CollectConditionDisplay(weatherData);
        weatherData.mesaureData(0.0f,0.0f,0.0f);
        weatherData.mesaureData(-20.0f,10.0f,30.0f);
        weatherData.mesaureData(2.0f,13.0f,20.0f);
        weatherData.mesaureData(3.0f,450.0f,10.0f);
    }

}
