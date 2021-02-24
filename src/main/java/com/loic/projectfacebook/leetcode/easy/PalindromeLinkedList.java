package com.loic.projectfacebook.leetcode.easy;

import java.util.Stack;

public class PalindromeLinkedList {


    boolean isPalindrome(ListNode head) {

        if(head == null)
            return true;

        ListNode p = head;
        ListNode prev = new ListNode(head.val);

        while(p.next != null){
            ListNode current = new ListNode(p.next.val);
            current.next = prev;
            prev = current;
            p = p.next;
        }

        ListNode p1 = head;
        ListNode p2 = prev;

        while(p1!=null){
            if(p1.val != p2.val)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;


        /*ListNode slow = head;

        Stack<Integer> stack = new Stack<>();

        while(slow != null) {

            stack.push(slow.val);
            slow = slow.next;

        }

        while(head != null) {


            int top = stack.pop();

            if(head.val == top) {

                head = head.next;

                return true;


            } else {

                return false;

            }


        }

        return true;*/

    }

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(1);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(1);
        ListNode six = new ListNode(1);
        ListNode seven = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        PalindromeLinkedList condition = new PalindromeLinkedList();
        System.out.println("isPalidrome :" + condition.isPalindrome(one));

    }
}
