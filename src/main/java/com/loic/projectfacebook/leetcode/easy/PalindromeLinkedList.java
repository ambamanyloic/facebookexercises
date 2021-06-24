package com.loic.projectfacebook.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {

    static ListNode head;


    boolean isPalindrome(ListNode head) {

        List<Integer> list = new ArrayList<>();

        ListNode current = head;
        while(current != null) {
                list.add(current.val);
                current = current.next;
        }

        int front = 0;
        int back = list.size() - 1;

        while(front < back) {

            if(list.get(front) != list.get(back)) {

                return false;
            }

            front++;
            back--;

        }

        return true;

    }

    public static void main(String[] args) {

        PalindromeLinkedList list = new PalindromeLinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(2);
        list.head.next.next.next = new ListNode(1);
        PalindromeLinkedList condition = new PalindromeLinkedList();
        System.out.println("isPalidrome :" + condition.isPalindrome(head));

    }
}
