package com.leetcode.algorithms.question7;

/**
 * FileName: SolutionA
 *
 * @author: yuchao
 * @date: 2018/9/20
 */
public class SolutionA implements Solution {

    @Override
    public int reverse(int x) {
        String inputStr = Integer.toString(Math.abs(x));
        int length = inputStr.length();
        char[] reverseChars = new char[length];
        for (int i = 0; i < length; i++) {
            reverseChars[i] = inputStr.charAt(length - i - 1);
        }

        String reverse = x > 0 ? new String(reverseChars) : "-" + new String(reverseChars);
        try {
            return Integer.parseInt(reverse);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

