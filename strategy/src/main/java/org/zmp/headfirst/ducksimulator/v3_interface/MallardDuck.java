package org.zmp.headfirst.ducksimulator.v3_interface;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    protected void display() {
        System.out.println("MallardDuck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
