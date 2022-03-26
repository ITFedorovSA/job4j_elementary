package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int count = 2; count <= number - 1; count++) {
                if (number % count == 0) {
                prime = false;
                break;
            }
        }
            return prime;
    }
}