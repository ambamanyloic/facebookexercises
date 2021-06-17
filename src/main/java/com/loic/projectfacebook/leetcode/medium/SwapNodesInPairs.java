package com.loic.projectfacebook.leetcode.medium;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        if ((head == null) || (head.next == null)) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairs(second.next);
        second.next = first;

        return second;


        /* ListNode res = head;
        while(head != null && head.next != null){
            int temp = head.val;
            head.val = head.next.val;
            head.next.val = temp;
            head = head.next.next;
        }
        return res;
        */

    }
}
