package org.zmp.headfirst.ducksimulator.v4_composition;

import org.zmp.headfirst.ducksimulator.v4_composition.fly.FlyBehavior;
import org.zmp.headfirst.ducksimulator.v4_composition.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    abstract void display();

    void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    void performQuack() {
        // delegate
        quackBehavior.quack();
    }

    void performFly() {
        // delegate
        flyBehavior.fly();
    }


}
