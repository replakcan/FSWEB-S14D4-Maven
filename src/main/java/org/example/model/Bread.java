package org.example.model;

public class Bread extends ProductForSale {

    private String brand;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("brand: " + brand +
                " price: " + getPrice() + " type: " + getType() +
                " description: " + getDescription()
        );
    }
}
