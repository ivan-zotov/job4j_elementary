package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        array[point] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compress = compress(input);
        System.out.println();
        for (int index = 0; index < compress.length; index++) {
            System.out.print(compress[index] + " ");
        }
    }
}
