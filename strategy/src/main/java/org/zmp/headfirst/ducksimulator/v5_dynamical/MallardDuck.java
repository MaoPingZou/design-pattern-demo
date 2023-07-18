package org.zmp.headfirst.ducksimulator.v5_dynamical;

import org.zmp.headfirst.ducksimulator.v5_dynamical.fly.FlyWithWings;
import org.zmp.headfirst.ducksimulator.v5_dynamical.quack.Quack;

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
