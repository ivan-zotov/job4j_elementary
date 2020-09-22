package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        double result3 = SqArea.square(18, 2);
        System.out.println(" p = 18, k = 2, s = 18, real = " + result3);
        double result4 = SqArea.square(8, 3);
        System.out.println(" p = 8, k = 3, s = 3, real = " + result4);
        double result5 = SqArea.square(45, 6);
        System.out.println(" p = 45, k = 6, s = 54, real = " + result5);
    }
}
