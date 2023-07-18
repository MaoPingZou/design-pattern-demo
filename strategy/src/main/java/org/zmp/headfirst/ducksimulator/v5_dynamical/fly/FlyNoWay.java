package org.zmp.headfirst.ducksimulator.v5_dynamical.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
