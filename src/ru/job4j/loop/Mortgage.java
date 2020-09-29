package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 0;
        while (amount > 0) {
            amount = (amount + amount * percent / 100) - salary;
            year += 1;
        }
        return year;
    }
}
