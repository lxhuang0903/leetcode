package com.leetcode.algorithms.question3;

/**
 * FileName: LongestSubstringWithoutRepeatingChar
 *
 * @author: yuchao
 * @date: 2018/8/20
 */
public class LongestSubstringWithoutRepeatingChar {

//    public static int lengthOfLongestSubstring(String s) {
//        int max = 0;
//        for (int i = 0; i < s.length(); i++) {
//            String result = String.valueOf(s.charAt(i));
//            for (int j = i + 1; j < s.length(); j++) {
//                String c1 = String.valueOf(s.charAt(j));
//                if (result.contains(c1)) {
//                    break;
//                }
//                result = result + c1;
//            }
//
//            if (result.length() > max) {
//                max = result.length();
//            }
//
//        }
//
//        return max;
//    }

    public static int lengthOfLongestSubstring(String s) {
        int[] mOccur = new int[256];
        int maxL = 0;
        for(int i = 0, j = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            ++mOccur[ch];
            while(mOccur[ch] > 1){
                --mOccur[s.charAt(j++)];
            }
            maxL = Math.max(maxL, i - j + 1);
        }
        return maxL;
    }

    public static void main(String[] args) {
//        System.out.println("abc".indexOf("c"));
        System.out.println(lengthOfLongestSubstring("abca"));
    }

}
