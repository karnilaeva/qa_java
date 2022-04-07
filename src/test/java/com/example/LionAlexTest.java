package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittens() throws Exception {
        LionAlex alex = new LionAlex(feline);

        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriends() throws Exception {
        List<String> expected = List.of("Марти", "Глория", "Мелман");

        LionAlex alex = new LionAlex(feline);

        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);

        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}