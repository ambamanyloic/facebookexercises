package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveNthNodeEndList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for(int i=1;i<n+1;i++){
            first = first.next;
        }

        while(first != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }

    public static void main(String [] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNthNodeEndList remove = new RemoveNthNodeEndList();

        System.out.println(remove.removeNthFromEnd(head,2));

    }


}
