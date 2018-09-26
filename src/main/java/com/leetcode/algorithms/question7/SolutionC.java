package com.leetcode.algorithms.question7;

/**
 * FileName: SolutionC
 *
 * @author: yuchao
 * @date: 2018/9/26
 */
public class SolutionC implements Solution {
    @Override
    public int reverse(int x) {
        int tmp = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (tmp > Integer.MAX_VALUE/10 || (tmp == Integer.MAX_VALUE/10 && pop > 7)) {
                return 0;
            }
            if (tmp < Integer.MIN_VALUE / 10 || (tmp == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            tmp = tmp * 10 + pop;
        }

        return tmp;
    }
}
