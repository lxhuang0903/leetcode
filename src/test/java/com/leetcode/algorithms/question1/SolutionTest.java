package com.leetcode.algorithms.question1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

/**
 * FileName: SolutionTest
 *
 * @author: yuchao
 * @date: 2018/9/3
 */
@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;

    @Parameterized.Parameters
    public static Collection init() {
        return Arrays.asList(
                new SolutionA(), new SolutionB()
        );
    }

    public SolutionTest(Solution solution) {
        this.solution = solution;
    }

    @Test
    public void case1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, actual);
    }

}