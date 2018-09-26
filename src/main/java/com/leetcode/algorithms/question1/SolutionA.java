package com.leetcode.algorithms.question1;

/**
 * FileName: SolutionA
 *
 * @author: yuchao
 * @date: 2018/9/3
 */
public class SolutionA implements Solution {

    @Override
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
