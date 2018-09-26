package com.leetcode.algorithms.question2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * FileName: AddTwoNumbers
 *
 * @author: yuchao
 * @date: 2018/7/27
 */
public class AddTwoNumbers {


    public static ListNode addTwoNumber(ListNode n1, ListNode n2) {
        return add(n1, n2, 0);
    }

    public static ListNode add(ListNode n1, ListNode n2, int i) {
        if (n1 == null && n2 == null && i == 0) {
            return null;
        }
        if (n1 == null) {
            n1 = new ListNode(0);
        }
        if (n2 == null) {
            n2 = new ListNode(0);
        }
        ListNode listNode = new ListNode((n1.val + n2.val + i) % 10);
        listNode.next = add(n1.next, n2.next, (n1.val + n2.val + i) / 10);
        return listNode;
    }

    public static void main(String[] args) {
        ListNode num1 = gen("243");
        ListNode num2 = gen("564");

        System.out.println(addTwoNumber(num1, num2));
    }

    public static ListNode gen(String num) {
        List<ListNode> list = num.chars().boxed().map(i -> new ListNode(Character.getNumericValue(i))).collect(Collectors.toList());
        IntStream.range(0, num.length()-1).forEach(i-> list.get(i).next = list.get(i+1));
        return list.get(0);
    }
    
}

