package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        for (int index = 0; index < arrayOne.length; index++) {
            arrayOne[index] = index * 2 + 3;
        }
        for (int index : arrayOne) {
            System.out.println(index);
        }
    }
}
