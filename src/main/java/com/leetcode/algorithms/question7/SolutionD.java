package com.leetcode.algorithms.question7;

/**
 * FileName: SolutionD
 *
 * @author: yuchao
 * @date: 2018/9/26
 */
public class SolutionD implements Solution {
    @Override
    public int reverse(int x) {
        long tmp = 0;

        while (x != 0) {
            tmp = tmp * 10 + x % 10;
            x /= 10;
        }
        if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) tmp;
    }
}
