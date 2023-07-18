package org.zmp.headfirst.ducksimulator.v5_dynamical;

import org.zmp.headfirst.ducksimulator.v5_dynamical.fly.FlyRocketPowered;
import org.zmp.headfirst.ducksimulator.v5_dynamical.quack.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();


        // model duck
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        System.out.println("我要飞的更高！！！！");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("但我不能叫了！！！！");
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performQuack();
    }
}
