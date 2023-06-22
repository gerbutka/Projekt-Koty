package com.example.cats;

/**
 * Klasa reprezentująca koty.
 */
public class Cat {
    private String name;
    private int age;

    /**
     * Konstruktor klasy Cat.
     *
     * @param name imię kota
     * @param age  wiek kota
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Metoda wywołująca dźwięk miauczenia kota.
     */
    public void meow() {
        System.out.println("Meow! My name is " + name + " and I'm " + age + " years old.");
    }
}
