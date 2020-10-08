package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{3}, {1, 2}, {0, 2, 1}, {2, 0, 1, 1}};
        for (int index = 0; index < array.length; index++) {
            System.out.println("Размер массива равен: " + array[index].length);
        }

    }
}
