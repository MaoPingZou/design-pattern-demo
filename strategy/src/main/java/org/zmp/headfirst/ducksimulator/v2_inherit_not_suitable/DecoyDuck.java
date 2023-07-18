package org.zmp.headfirst.ducksimulator.v2_inherit_not_suitable;

public class DecoyDuck extends Duck {

    @Override
    void quack() {
        // override to do nothing
    }

    @Override
    protected void display() {
        System.out.println("DecoyDuck");
    }

    @Override
    void fly() {
        // override to do nothing
    }
}
