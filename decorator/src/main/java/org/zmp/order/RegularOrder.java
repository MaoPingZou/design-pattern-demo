package org.zmp.order;

/**
 * 常规订单
 */
public class RegularOrder implements Order {

    private double amount;

    public RegularOrder(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateTotalAmount() {
        return amount;
    }
}
