package org.zmp.headfirst.ducksimulator.v5_dynamical.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silent >>");
    }
}
