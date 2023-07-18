package org.zmp.coffee;

public class Main {

    public static void main(String[] args) {
        // 基本咖啡 (espresso 表示 意式浓缩咖啡)
        Coffee espresso = new Espresso();
        System.out.println("Espresso price: " + espresso.getCost());

        // 只加牛奶🥛
        Coffee espressoWithMilk = new MilkDecorator(espresso);
        System.out.println("Espresso with milk price: " + espressoWithMilk.getCost());

        // 只加糖
        Coffee espressoWithSugar = new SugarDecorator(espresso);
        System.out.println("Espresso with sugar price: " + espressoWithSugar.getCost());

        // 加了牛奶 和 🍬
        Coffee espressoWithMilkAndSugar = new SugarDecorator(new MilkDecorator(espresso));
        // 不管怎么装饰(先加牛奶再加糖或者先加糖再加牛奶，都不影响结果)，都可以
//        Coffee espressoWithMilkAndSugar = new MilkDecorator(new SugarDecorator(espresso));
        System.out.println("Espresso with milk and sugar price: " + espressoWithMilkAndSugar.getCost());
    }
}
