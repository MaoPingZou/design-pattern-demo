package org.zmp.headfirst.ducksimulator.v2_inherit_not_suitable;

public class RubberDuck extends Duck  {
    @Override
    protected void display() {
        System.out.println("RubberDuck");
    }

    @Override
    void fly() {
        // override to do nothing
    }
}
