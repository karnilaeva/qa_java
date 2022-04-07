package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();

        assertEquals(food, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();

        assertEquals(1, feline.getKittens());
    }

}