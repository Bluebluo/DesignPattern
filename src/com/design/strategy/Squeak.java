package com.design.strategy;

/**
 * @program: DesignPattern
 * @description: 惨叫
 * @author: Li Hongmou
 * @create: 2019-03-26 15:48
 **/
public class Squeak implements QuackBeahvior {
    @Override
    public void quack() {
        System.out.println(" squeak squeak! ");
    }
}
