package com.loic.projectfacebook.leetcode.easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode prehead = new ListNode(-1);

        ListNode l3 = prehead;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;

            } else {
                l3.next = l2;
                l2 =l2.next;
            }

            l3 =l3.next;
        }
        return prehead.next;
    }
}
