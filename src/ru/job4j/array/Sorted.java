package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = true;
        for (int index = 1; index < array.length; index++) {
            if (array[index - 1] > array[index]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
