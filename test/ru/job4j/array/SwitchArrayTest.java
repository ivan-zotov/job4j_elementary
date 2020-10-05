package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.array;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void thenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void thenSwap1To2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void thenSwap0To1() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {3, 2, 1, 4};
        int[] rsl = SwitchArray.swap(input, 0, 2);
        assertThat(rsl, is(expect));
    }

}