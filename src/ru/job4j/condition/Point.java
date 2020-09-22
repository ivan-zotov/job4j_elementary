package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int first = x2 - x1;
        int second = y2 - y1;
        double firstpow = Math.pow(first, 2);
        double secondpow = Math.pow(second, 2);
        double sum = firstpow + secondpow;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double resultFirst = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + resultFirst);
        double resultSecond = Point.distance(1, 1, 6, 2);
        System.out.println("result (0, 0) to (2, 0) is " + resultSecond);
        double resultThird = Point.distance(0, 2, 3, 2);
        System.out.println("result (0, 0) to (2, 0) is " + resultThird);

    }
}
