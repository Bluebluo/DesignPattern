package com.design.strategy;

/**
 * @program: DesignPattern
 * @description: 鸭宝宝
 * @author: Li Hongmou
 * @create: 2019-03-26 15:54
 **/
public class BabyDuck extends Duck {

    public BabyDuck(){
        flyBehavior = new FlyNoWay();
        quackBeahvior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println(" i am a baby duck! ");
    }
}
