package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArrayTest0() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArrayTest1() {
        int[] input = new int[]{5, 7, 2, 9, 8, 3};
        int[] result = Turn.back(input);
        int[] expected = new int[]{3, 8, 9, 2, 7, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        Assert.assertArrayEquals(expected, result);
    }
}