package org.example.model;

public class Bread extends ProductForSale {
    private String size;

    public Bread(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    public Bread(String test, int price, String testBread) {
        super(test, price, testBread);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Size: " + size);
    }
}
