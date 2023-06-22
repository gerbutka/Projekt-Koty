package com.example.cats;

import org.junit.Test;

/**
 * Klasa testowa do testowania funkcjonalności klas związanych z kotami.
 */
public class CatTest {
    @Test
    public void testCatFunctionality() {
        Cat cat = new Cat("Whiskers", 5);
        cat.meow();

        CatFood catFood = new CatFood("Purina", 10.99);
        catFood.displayInfo();

        CatToy catToy = new CatToy("Feather", "Red");
        catToy.play();
    }
}
