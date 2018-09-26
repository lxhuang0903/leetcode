package com.leetcode.algorithms.question1;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName: SolutionB
 *
 * @author: yuchao
 * @date: 2018/9/3
 */
public class SolutionB implements Solution {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
