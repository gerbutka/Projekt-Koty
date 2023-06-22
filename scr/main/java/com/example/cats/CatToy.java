package com.example.cats;

public class CatToy {
    private String name;
    private String color;

    public CatToy(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void play() {
        System.out.println("Playing with " + color + " " + name + " toy!");
    }
}
