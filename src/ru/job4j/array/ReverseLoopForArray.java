package ru.job4j.array;

import ru.job4j.loop.CheckPrimeNumber;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int index = 0; index < numbers.length; index++) {
            if ((numbers.length - 1 - index) % 2 == 0) {
                System.out.println("Текущий элемент массива с четным индексом начиная с последнего: "
                        + numbers[numbers.length - 1 - index]);
            }
        }
    }
}
