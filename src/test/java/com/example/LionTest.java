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
public class LionTest {

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void canNotCreateLionWithThirdSex() throws Exception {
        new Lion(feline, "метросексуал");
    }

    @Test
    public void getKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion(feline, "Самец");

        assertEquals(3, lion.getKittens());
    }

    @Test
    public void lionMaleHasMane() throws Exception {
        Lion lion = new Lion(feline, "Самец");

        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionFemaleDoesNotHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самка");

        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        List<String> food = Arrays.asList("Отбивная", "Лопатка");

        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion(feline, "Самец");

        assertEquals(food, lion.getFood());
    }
}