package com.leetcode.algorithms.question13;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * FileName: SolutionA
 *
 * @author: yuchao
 * @date: 2018/9/28
 */
public class SolutionA implements Solution {

    static Map<String, Integer> romanMap = new LinkedHashMap<>();

    static {
        romanMap.put("CM", 900);
        romanMap.put("CD", 400);
        romanMap.put("XC", 90);
        romanMap.put("XL", 40);
        romanMap.put("IX", 9);
        romanMap.put("IV", 4);
        romanMap.put("M", 1000);
        romanMap.put("D", 500);
        romanMap.put("C", 100);
        romanMap.put("L", 50);
        romanMap.put("X", 10);
        romanMap.put("V", 5);
        romanMap.put("I", 1);

    }

    @Override
    public int romanToInt(String s) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : romanMap.entrySet()) {
            String symbol = entry.getKey();
            Integer intValue = entry.getValue();
            while (s.indexOf(symbol) >= 0) {
                sum += intValue;
                s = s.replaceFirst(symbol, "");
            }
        }

        return sum;
    }
}
