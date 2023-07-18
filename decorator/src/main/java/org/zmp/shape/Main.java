package org.zmp.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        // RedShapeDecorator 的构造器是protected的，所有同包才能使用
        // 装饰 Circle 对象
        Shape redCircle = new RedShapeDecorator(new Circle());
        // 装饰 Rectangle 对象
        Shape redRectangle = new RedShapeDecorator(new Rectangle());


        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}