package org.zmp.headfirst.ducksimulator.v4_composition;

import org.zmp.headfirst.ducksimulator.v4_composition.fly.FlyWithWings;
import org.zmp.headfirst.ducksimulator.v4_composition.quack.Quack;

public class MallardDuck extends Duck {

    /**
     * inherits the quackBehavior And flyBehavior instance variables
     * from class Duck
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a really Mallard Duck");
    }
}
