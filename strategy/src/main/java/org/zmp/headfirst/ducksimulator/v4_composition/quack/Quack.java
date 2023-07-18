package org.zmp.headfirst.ducksimulator.v4_composition.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
