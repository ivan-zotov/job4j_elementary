package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int index = 0; index < hours.length; index++) {
            if ((hours[index] <= 8) && (index <= hours.length - 3)) {
                salary = salary + hours[index] * 10;
            } else if ((hours[index] > 8) && (index <= hours.length - 3)) {
                salary = salary + (hours[index] - 8) * 15 + (hours[index] - (hours[index] - 8)) * 10;
            } else if ((hours[index] <= 8) && (index > hours.length - 3)) {
                salary = salary + hours[index] * 10 * 2;
            } else  if ((hours[index] > 8) && (index > hours.length - 3)) {
                salary = salary + (hours[index] - 8) * 15 * 2 + (hours[index] - (hours[index] - 8)) * 10 * 2;
            }
        }
        return salary;
    }

    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = WeeklySalary.calculate(hours);
        System.out.println(rsl);
    }
}
