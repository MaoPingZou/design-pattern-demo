package org.zmp.coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
