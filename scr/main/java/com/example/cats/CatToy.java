package com.example.cats;


/**
 * Klasa reprezentująca zabawkę dla kotów.
 */
public class CatToy {
    private String name;
    private String color;

    /**
     * Konstruktor klasy CatToy.
     *
     * @param name  nazwa zabawki
     * @param color kolor zabawki
     */
    public CatToy(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Metoda uruchamiająca zabawę z zabawką dla kotów.
     */
    public void play() {
        System.out.println("Playing with " + color + " " + name + " toy!");
    }
}

