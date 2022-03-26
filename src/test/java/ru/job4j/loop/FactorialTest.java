package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

        @Test
        public void whenCalculateFactorialFor5Then120() {
            int num = 5;
            int expected = 120;
            int out = Factorial.calc(num);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void whenCalculateFactorialFor0Then1() {
            int num = 0;
            int expected = 1;
            int out = Factorial.calc(num);
            Assert.assertEquals(expected, out);
        }
    }
