package org.zmp.headfirst.ducksimulator.v3_interface;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    protected void display() {
        System.out.println("RedheadDuck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
