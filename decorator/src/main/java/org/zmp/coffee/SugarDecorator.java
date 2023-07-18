package org.zmp.coffee;

public class SugarDecorator extends CoffeeDecorator {

    private final double SUGAR_COST = 2;
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + SUGAR_COST;
    }
}
