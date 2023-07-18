package org.zmp.order;

/**
 * 折扣订单
 */
public class DiscountOrder implements Order {
    private double amount;
    private double discount;

    public DiscountOrder(double amount, double discount) {
        this.amount = amount;
        this.discount = discount;
    }

    @Override
    public double calculateTotalAmount() {
        return amount * (1 - discount);
    }
}
