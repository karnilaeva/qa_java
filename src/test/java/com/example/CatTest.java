package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);

        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        List<String> food = Arrays.asList("Мышка", "Колбаска");
        Mockito.when(feline.eatMeat()).thenReturn(food);

        Cat cat = new Cat(feline);

        assertEquals(food, cat.getFood());
    }
}