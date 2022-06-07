package ru.job4j.array;

import java.io.FileOutputStream;
import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                table[row][cell] = (cell + 1) * (row + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("matrix.txt")) {
            out.write(Arrays.deepToString(multiple(9)).getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
