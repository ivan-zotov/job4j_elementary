package ru.job4j.condition;

public class SquareArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int start = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = start;
                start++;
                System.out.println(array[i][j]);
            }
        }
    }
}
