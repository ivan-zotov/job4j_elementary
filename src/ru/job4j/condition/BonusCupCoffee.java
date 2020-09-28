package ru.job4j.condition;

public class BonusCupCoffee {
    public static String checkNumber(int number) {
        if (number % 3 == 0) {
            return "Hello";
        }
        if (number % 5 == 0) {
            return "World";
        }
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "Hello, World!!!";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(BonusCupCoffee.checkNumber(15));
    }
}
