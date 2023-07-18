package org.zmp.headfirst.ducksimulator.v5_dynamical;

import org.zmp.headfirst.ducksimulator.v5_dynamical.fly.FlyNoWay;
import org.zmp.headfirst.ducksimulator.v5_dynamical.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
