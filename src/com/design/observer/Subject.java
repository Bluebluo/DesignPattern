package com.design.observer;

/**
 * @program: DesignPattern
 * @description: 发布者接口
 * @author: Li Hongmou
 * @create: 2019-03-26 17:03
 **/
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
