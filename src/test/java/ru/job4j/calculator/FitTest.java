package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenManHeight187ThenWeight100dot05() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenWomanHeight187ThenWeight88dot55() {
        short in = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }
}