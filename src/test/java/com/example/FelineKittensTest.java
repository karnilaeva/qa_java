package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineKittensTest {

    private final int expected;

    public FelineKittensTest(int expected) {
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][] {
                { 1 },
                { 15 },
                { 48 },
                { 0 },
                { -55 },
        };
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();

        int actual = feline.getKittens(expected);
        assertEquals(expected, actual);
    }
}