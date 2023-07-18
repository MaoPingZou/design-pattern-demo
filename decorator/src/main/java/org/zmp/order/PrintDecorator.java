package org.zmp.order;

public class PrintDecorator extends OrderDecorator {
    public PrintDecorator(Order order) {
        super(order);
    }

    @Override
    public double calculateTotalAmount() {
        double totalAmount = super.calculateTotalAmount();
        // 打印订单细节
        printOrderDetails();
        return totalAmount;
    }

    private void printOrderDetails() {
        // Perform order details printing logic
        System.out.println("Printing order details...");
    }

}
