package org.example.model;

public class Store {

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("Dark Chocolate", 5.99, "Rich dark chocolate", 70.0);
        ProductForSale coke = new Coke("Coca Cola", 1.99, "Refreshing soda", false);
        ProductForSale bread = new Bread("Whole Wheat Bread", 2.49, "Healthy bread", "Whole Wheat");

        ProductForSale[] products = {chocolate, coke, bread};

        Store store = new Store();
        store.listProducts(products);
    }
}
