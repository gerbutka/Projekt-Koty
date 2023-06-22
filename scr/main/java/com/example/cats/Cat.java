package com.example.cats;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow! My name is " + name + " and I'm " + age + " years old.");
    }
}