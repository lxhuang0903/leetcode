package com.leetcode.algorithms.question9;

/**
 * FileName: SolutionA
 *
 * @author: yuchao
 * @date: 2018/9/26
 */
public class SolutionA implements Solution {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

        int length = String.valueOf(x).length();
        for (int i = 0 ; i < length/2; i++){
            int tmp = x / (int)Math.pow(10, (length -1 - (i * 2)));
            int last = x % 10;
            if (tmp != last) {
                return false;
            }
            x = (x - (tmp * (int)Math.pow(10, (length -1 - (i * 2))))) / 10;
        }

        return true;
    }

}
