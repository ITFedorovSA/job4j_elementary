package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0, endIndex = array.length - 1; index < array.length / 2; index++, endIndex--) {
            int temp = array[index];
            array[index] = array[endIndex];
            array[endIndex] = temp;
        }
        return array;
    }
}
