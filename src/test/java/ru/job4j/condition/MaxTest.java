package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9Tominus4Then9() {
        int left = 9;
        int right = -4;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxminus3Tominus2Thenminus2() {
        int left = -3;
        int right = -2;
        int result = Max.max(left, right);
        int expected = -2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxminus1Tominus1Thenminus1() {
        int left = -1;
        int right = -1;
        int result = Max.max(left, right);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }
}