package org.example.model;

public class Coke extends ProductForSale {
    private boolean isDiet;

    public Coke(String type, double price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    public Coke(String test, int price, String testCoke) {
        super(test, price, testCoke);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Diet: " + (isDiet ? "Yes" : "No"));
    }
}
