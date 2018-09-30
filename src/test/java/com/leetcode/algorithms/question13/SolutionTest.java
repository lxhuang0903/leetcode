package com.leetcode.algorithms.question13;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * FileName: SolutionTest
 *
 * @author: yuchao
 * @date: 2018/9/28
 */
@RunWith(Parameterized.class)
public class SolutionTest {
    private Solution solution;
    private String input;
    private int expected;

    @Parameterized.Parameters
    public static Collection init() {
        return Arrays.asList( new Object[][]{
                        {"III", 3},
                        {"IV", 4},
                        {"IX", 9},
                        {"LVIII", 58},
                        {"MCMXCIV", 1994}
                }
        );
    }

    public SolutionTest(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSolutionA() {
        solution = new SolutionA();
        int actual = solution.romanToInt(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        solution = new SolutionB();
        int actual = solution.romanToInt(input);
        Assert.assertEquals(expected, actual);
    }
}