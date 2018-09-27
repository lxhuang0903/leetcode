package com.leetcode.algorithms.question9;

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
 * @date: 2018/9/26
 */
@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;
    private int input;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection init() {
        return Arrays.asList( new Object[][]{
                        {121, true},
                        {-121, false},
                        {10, false},
                        {11, true},
                        {1001, true},
                        {10021, false},
                        {1221, true},
                        {0,true}
                }
        );
    }

    public SolutionTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSolutionA() {
        solution = new SolutionA();
        boolean actual = solution.isPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        solution = new SolutionB();
        boolean actual = solution.isPalindrome(input);
        Assert.assertEquals(expected, actual);
    }
}