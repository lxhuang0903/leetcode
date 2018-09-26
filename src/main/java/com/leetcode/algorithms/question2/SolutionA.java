package com.leetcode.algorithms.question2;

/**
 * FileName: SolutionA
 *
 * @author: yuchao
 * @date: 2018/9/3
 */
public class SolutionA implements Solution {
    @Override
    public ListNode addTwoNumber(ListNode n1, ListNode n2) {
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
}
