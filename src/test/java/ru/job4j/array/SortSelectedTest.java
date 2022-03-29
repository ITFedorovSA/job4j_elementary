package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elementsTest0() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5elementsTest1() {
        int[] data = new int[] {4, 3, 2, 8, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {7, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }
}