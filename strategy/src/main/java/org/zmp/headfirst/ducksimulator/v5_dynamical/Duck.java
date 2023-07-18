package org.zmp.headfirst.ducksimulator.v5_dynamical;

import org.zmp.headfirst.ducksimulator.v5_dynamical.fly.FlyBehavior;
import org.zmp.headfirst.ducksimulator.v5_dynamical.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
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
