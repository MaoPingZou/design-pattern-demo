package org.zmp.order;

public class ShippingDecorator extends OrderDecorator {
    public ShippingDecorator(Order order) {
        super(order);
    }

    @Override
    public double calculateTotalAmount() {
        double totalAmount = super.calculateTotalAmount();
        return totalAmount + calculateShippingCost();
    }

    private double calculateShippingCost() {
        // Perform shipping cost calculation logic
        return 5.0;
    }
}
