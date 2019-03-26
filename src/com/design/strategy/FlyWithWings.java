package com.design.strategy;

/**
 * @program: DesignPattern
 * @description: 用翅膀飞
 * @author: Li Hongmou
 * @create: 2019-03-26 15:42
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" i can fly with wings!");
    }
}
