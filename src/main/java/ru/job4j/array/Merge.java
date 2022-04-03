package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
        rsl[i] = left[i];
        count++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[count++] = right[j];
        }
        for (int index = 0; index < rsl.length - 1; index++) {
        int min = rsl[index];
        for (int m = index + 1; m < rsl.length; m++) {
            if (min > rsl[m]) {
                min = rsl[m];
            }
        }
        int minInd = 0;
        for (int ind = 0; ind < rsl.length; ind++) {
            if (min == rsl[ind]) {
                minInd = ind;
                break;
            }
        }
            int temp = rsl[minInd];
            rsl[minInd] = rsl[index];
            rsl[index] = temp;
        }
        return rsl;
    }
}
