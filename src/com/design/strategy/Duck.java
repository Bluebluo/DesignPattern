package com.design.strategy;

/**
 * @program: DesignPattern
 * @description: 鸭子的抽象父类
 * @author: Li Hongmou
 * @create: 2019-03-26 15:39
 **/
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBeahvior quackBeahvior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBeahvior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBeahvior(QuackBeahvior quackBeahvior){
        this.quackBeahvior = quackBeahvior;
    }
}
