package com.example.cats;

/**
 * Klasa reprezentująca jedzenie dla kotów.
 */
public class CatFood {
    private String brand;
    private double price;

    /**
     * Konstruktor klasy CatFood.
     *
     * @param brand marka jedzenia
     * @param price cena jedzenia
     */
    public CatFood(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * Metoda wyświetlająca informacje o jedzeniu dla kotów.
     */
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}
