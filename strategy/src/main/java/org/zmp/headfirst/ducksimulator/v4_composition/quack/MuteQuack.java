package org.zmp.headfirst.ducksimulator.v4_composition.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silent >>");
    }
}
