package org.zmp.order;

public class GiftOrder implements Order {
    private double amount;
    private String gift;

    public GiftOrder(double amount, String gift) {
        this.amount = amount;
        this.gift = gift;
    }

    @Override
    public double calculateTotalAmount() {
        return amount;
    }
}
