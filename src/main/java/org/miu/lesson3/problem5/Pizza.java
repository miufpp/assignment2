package org.miu.lesson3.problem5;

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaTypes pizzaType;
    private int quantity;
    private double price;

    public Pizza(PizzaSize pizzaSize, PizzaTypes pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    private void calculatePrice() {
        double price = switch (this.pizzaSize) {
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };

        double amount = switch (pizzaType) {
            case VEGGIE -> 1;
            case PEPPERONI,BBQCHICKEN -> 2;
            case CHEEZE -> 1.5;
        };
        this.price=(price+amount)*quantity;
    }

    public String printOrderSummary(){
        //todo get dollar currency instance from NumberFormat and display the total prices and co in dollars
        this.calculatePrice();
        return String.format("Pizza order:\nSize:%s\nType:%s\nQty:%d\nPrice:%.2f\nTax:%.2f\nTotal Price:%.2f",pizzaSize.toString(),pizzaType.toString(),quantity,price,0.03*price,price+(0.03*price));
    }
}
