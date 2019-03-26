package com.design.strategy;

/**
 * @program: DesignPattern
 * @description: 不会飞
 * @author: Li Hongmou
 * @create: 2019-03-26 15:43
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" i can not fly! ");
    }
}
