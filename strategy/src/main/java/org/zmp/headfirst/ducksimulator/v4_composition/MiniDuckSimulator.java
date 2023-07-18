package org.zmp.headfirst.ducksimulator.v4_composition;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();
    }
}
