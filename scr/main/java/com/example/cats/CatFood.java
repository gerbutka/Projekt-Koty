package com.example.cats;

public class CatFood {
    private String brand;
    private double price;

    public CatFood(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}
