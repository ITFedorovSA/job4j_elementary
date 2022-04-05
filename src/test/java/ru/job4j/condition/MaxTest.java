package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax1To2To4To0Then4() {
        int first = 1;
        int second = 2;
        int third = 4;
        int fourth = 0;
        int result = new Max().max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9ToMinus4ToMinus2To10Then10() {
        int first = 9;
        int second = -4;
        int third = -2;
        int fourth = 10;
        int result = new Max().max(first, second, third, fourth);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxMinus3ToMinus2ToMinus6ToMinus1ThenMinus1() {
        int first = -3;
        int second = -2;
        int third = -6;
        int fourth = -1;
        int result = new Max().max(first, second, third, fourth);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxMinus1ToMinus1ToMinus1ToMinus1ThenMinus1() {
        int first = -1;
        int second = -1;
        int third = -1;
        int fourth = -1;
        int result = new Max().max(first, second, third, fourth);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }
}