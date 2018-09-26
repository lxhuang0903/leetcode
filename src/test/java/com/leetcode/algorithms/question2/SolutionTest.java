package com.leetcode.algorithms.question2;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * FileName: SolutionTest
 *
 * @author: yuchao
 * @date: 2018/9/3
 */
public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new SolutionA();
    }

    @Test
    public void test() {
        ListNode num1 = gen("243");
        ListNode num2 = gen("564");
        ListNode listNode = solution.addTwoNumber(num1, num2);

    }

    private ListNode gen(String num) {
        List<ListNode> list = num.chars().boxed().map(i -> new ListNode(Character.getNumericValue(i))).collect(Collectors.toList());
        IntStream.range(0, num.length()-1).forEach(i-> list.get(i).next = list.get(i+1));
        return list.get(0);
    }

}