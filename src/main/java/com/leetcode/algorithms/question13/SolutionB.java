package com.leetcode.algorithms.question13;

/**
 * FileName: SolutionB
 *
 * @author: yuchao
 * @date: 2018/9/30
 */
public class SolutionB implements Solution {
    @Override
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int[] numForms = new int[s.length()];
        for (int i = 0; i < chars.length; i++) {
            char symbol = chars[i];
            if (symbol == 'I') {
                numForms[i] = 1;
            } else if (symbol == 'V') {
                numForms[i] = 5;
            } else if (symbol == 'X') {
                numForms[i] = 10;
            } else if (symbol == 'L') {
                numForms[i] = 50;
            } else if (symbol == 'C') {
                numForms[i] = 100;
            } else if (symbol == 'D') {
                numForms[i] = 500;
            } else if (symbol == 'M') {
                numForms[i] = 1000;
            }
        }

        int sum = 0;
        for (int i = 0; i < numForms.length; i++) {
            if (i < numForms.length -1 && numForms[i] < numForms[i + 1]) {
                numForms[i] *= -1;
            }
            sum += numForms[i];
        }
        return sum;
    }
}
