package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FamilyAnimalTest {

    private final String expectedFamily;
    private final boolean expectedResult;

    public FamilyAnimalTest(String expectedFamily, boolean expectedResult) {
        this.expectedFamily = expectedFamily;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][]{
                {"заячьи", true},
                {"беличьи", true},
                {"мышиные", true},
                {"кошачьи", true},
                {"псовые", true},
                {"медвежьи", true},
                {"куньи", true},
                {"динозаврьи", false},
        };
    }

    @Test
    public void familyExists() {
        Animal animal = new Animal();

        assertEquals(animal.getFamily().contains(expectedFamily), expectedResult);
    }
}