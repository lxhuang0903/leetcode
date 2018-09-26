package com.leetcode.algorithms.question7;

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
 * @date: 2018/9/20
 */
@RunWith(Parameterized.class)
public class SolutionTest {
    private Solution solution;
    private int input;
    private int expected;

    @Parameterized.Parameters
    public static Collection init() {
        return Arrays.asList( new Object[][]{
                {123, 321},
                {-123, -321},
                {120, 21},
                {Integer.MAX_VALUE, 0},
                {Integer.MIN_VALUE, 0}
            }
        );
    }

    public SolutionTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSolutionA() {
        assertResult(new SolutionA());
    }

    @Test
    public void testSolutionB() {
        assertResult(new SolutionB());
    }
    @Test
    public void testSolutionC() {
        assertResult(new SolutionC());
    }
    @Test
    public void testSolutionD() {
        assertResult(new SolutionD());
    }

    public void assertResult(Solution solution) {
        int result = solution.reverse(input);
        Assert.assertEquals(expected, result);
    }
}