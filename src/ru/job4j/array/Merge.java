package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (i > left.length - 1) {
                int temp = right[j++];
                rsl[index] = temp;
            } else if (j > right.length - 1) {
                int temp = left[i++];
                rsl[index] = temp;
            } else if (left[i] < right[j]) {
                int temp = left[i++];
                rsl[index] = temp;
            } else {
                int temp = right[j++];
                rsl[index] = temp;
            }
        }
        return rsl;
    }
}
