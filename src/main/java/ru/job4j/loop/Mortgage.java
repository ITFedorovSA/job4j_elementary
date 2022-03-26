package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double annual = amount + (amount * (percent / 100));
            while (annual > 0) {
                annual = annual - salary;
                year += 1;
        }
        return year;
    }
}
