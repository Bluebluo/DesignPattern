package com.design.strategy;

/**
 * @program: DesignPattern
 * @description: 测试类
 * @author: Li Hongmou
 * @create: 2019-03-26 15:55
 **/
public class DuckTest {
    public static void main(String[] args){
        Duck babyDuck = new BabyDuck();
        babyDuck.performFly();
        babyDuck.performQuack();
        babyDuck.display();
        Duck woodDuck = new WoodDuck();
        woodDuck.performFly();
        woodDuck.performQuack();
        woodDuck.display();
    }
}
