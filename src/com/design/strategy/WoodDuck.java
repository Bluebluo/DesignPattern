package com.design.strategy;

/**
 * @program: DesignPattern
 * @description: 木头鸭子
 * @author: Li Hongmou
 * @create: 2019-03-26 15:44
 **/
public class WoodDuck extends Duck {

    public WoodDuck(){
        flyBehavior = new FlyWithWings();
        quackBeahvior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(" i am a wood duck! ");
    }
}
