package org.zmp.order;

public abstract class OrderDecorator implements Order {
    private Order order;

    protected OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double calculateTotalAmount() {
        return order.calculateTotalAmount();
    }
}
