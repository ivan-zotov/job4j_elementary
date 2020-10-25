package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMaxOfTwo() {
        int result = Max.max(2, 6);
        assertEquals(result, 6);
    }

    @Test
    public void whenMaxOfThree() {
        int result = Max.max(7, 3, 4);
        assertEquals(result, 7);
    }

    @Test
    public void whenMaxOfFour() {
        int result = Max.max(1, 8, 7, 3);
        assertEquals(result, 8);
    }
}