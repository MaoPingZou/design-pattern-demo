package org.zmp.order;

public class Main {
    public static void main(String[] args) {
        Order order = new RegularOrder(100.0);
        Order decoratedOrder = new PrintDecorator(new ShippingDecorator(order));

        double totalAmount = decoratedOrder.calculateTotalAmount();
        System.out.println("Total amount: " + totalAmount);
    }
}
