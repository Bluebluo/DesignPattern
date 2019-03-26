package com.design.strategy;

/**
 * @program: DesignPattern
 * @description: 正常鸭子叫
 * @author: Li Hongmou
 * @create: 2019-03-26 15:48
 **/
public class Quack implements QuackBeahvior {
    @Override
    public void quack() {
        System.out.println(" quack quack! ");
    }
}
