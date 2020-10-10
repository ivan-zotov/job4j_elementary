package ru.job4j.sort;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int surr = money - price;
        for (int index = 0; index < COINS.length; index++) {
            while (surr - COINS[index] >= 0) {
                rsl[size] = COINS[index];
                surr = surr - COINS[index];
                size += 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
