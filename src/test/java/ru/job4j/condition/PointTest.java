package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to21then1() {
        double expected = 1;
        Point a = new Point(3, 1);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenminus12to01then1dot41() {
        double expected = 1.41f;
        Point a = new Point(-1, 2);
        Point b = new Point(0, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0minus2to10then2dot23() {
        double expected = 2.23f;
        Point a = new Point(0, -2);
        Point b = new Point(1, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}