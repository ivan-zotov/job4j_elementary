package ru.job4j.convert;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rebles is " + euro + " euro");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles is " + dollar + " dollar");
        int inDollar = 180;
        int expectedDollar = 3;
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = outDollar == expectedDollar;
        System.out.println("180 rubles are 3 euro. Test result : " + passedDollar);
    }
}
