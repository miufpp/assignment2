package org.miu.lesson3.problem5;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(PizzaSize.SMALL, PizzaTypes.VEGGIE,2);
        Pizza pizza2 = new Pizza(PizzaSize.MEDIUM, PizzaTypes.PEPPERONI,1);
        Pizza pizza3 = new Pizza(PizzaSize.LARGE, PizzaTypes.BBQCHICKEN,2);
        System.out.println(pizza1.printOrderSummary());
        System.out.println(pizza2.printOrderSummary());
        System.out.println(pizza3.printOrderSummary());
    }
}
