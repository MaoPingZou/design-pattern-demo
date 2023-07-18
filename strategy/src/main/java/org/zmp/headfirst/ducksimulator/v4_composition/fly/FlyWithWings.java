package org.zmp.headfirst.ducksimulator.v4_composition.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
