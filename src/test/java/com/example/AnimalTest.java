package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getFoodFromGrossEater() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");

        Animal animal = new Animal();

        assertEquals(expected, animal.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
    public void getFoodFromUnknownAnimal() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Динозавр");
    }
}