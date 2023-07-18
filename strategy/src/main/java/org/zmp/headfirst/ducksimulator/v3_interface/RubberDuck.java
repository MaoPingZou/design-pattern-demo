package org.zmp.headfirst.ducksimulator.v3_interface;


public class RubberDuck extends Duck implements Quackable {
    @Override
    protected void display() {
        System.out.println("RubberDuck");
    }

    @Override
    public void quack() {

    }
}
