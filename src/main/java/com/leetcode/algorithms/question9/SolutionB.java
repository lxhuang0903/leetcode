package com.leetcode.algorithms.question9;

/**
 * FileName: SolutionB
 *
 * @author: yuchao
 * @date: 2018/9/27
 */
public class SolutionB implements Solution {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int origin = x;
        int tmp = 0;

        while (x != 0) {
            tmp = tmp * 10 + x % 10;
            x = x / 10;
        }

        if (tmp == origin) {
            return true;
        }
        return false;
    }
}
