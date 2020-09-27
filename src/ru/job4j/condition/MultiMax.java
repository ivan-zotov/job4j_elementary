package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result1 = first > second ? first : second;
        int result = result1 > third ? result1 : third;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(1, 4, 2));
        System.out.println(MultiMax.max(5, 1, 3));
        System.out.println(MultiMax.max(3, 2, 8));
        System.out.println(MultiMax.max(4, 4, 4));
    }
}
