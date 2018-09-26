package com.leetcode.algorithms.question7;

/**
 * FileName: SolutionB
 *
 * @author: yuchao
 * @date: 2018/9/20
 */
public class SolutionB implements Solution {
    @Override
    public int reverse(int x) {
        int tmp = 0;

        try {
            while (x != 0){
                int pop = x % 10;
                x /= 10;
                tmp = Math.addExact(Math.multiplyExact(tmp, 10), pop);
            }
        } catch (Exception e) {
            return  0;
        }

        return tmp;
    }
}
