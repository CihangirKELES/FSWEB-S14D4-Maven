package org.example.model;

public class Chocolate extends ProductForSale {
    private double weight;

    public Chocolate(String type, double price, String description, double weight) {
        super(type, price, description);
        this.weight = weight;
    }

    public Chocolate(String test, int price, String testChocolate) {
        super(test, price, testChocolate);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Weight: " + weight + " grams");
    }
}
