package org.example.model;

public class Coke extends ProductForSale{

    private String brand;

    public Coke(String type, int price, String description) {
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
