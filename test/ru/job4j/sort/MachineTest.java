package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {

    @Test
    public void change() {
        Machine machine = new Machine();
        int[] expect = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when83by35() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 5, 2, 1};
        int[] rsl = machine.change(83, 35);
        assertThat(rsl, is(expected));
    }
}