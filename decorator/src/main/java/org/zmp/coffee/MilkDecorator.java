package org.zmp.coffee;

public class MilkDecorator extends CoffeeDecorator {

    private final double MILK_COST = 5;

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + MILK_COST;
    }
}
