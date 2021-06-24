package com.loic.projectfacebook.crackingcode.linkedlists;

import java.util.Stack;

public class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> stack =  new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {

            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast!= null) { slow= slow.next; }

        while(slow != null) {

            int temp_node = stack.pop();

            if(temp_node != slow.value ) {
                return false;
            }

            slow = slow.next;
        }

        return true;

    }

    static void printList(ListNode ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.value + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);

        LinkedListPalindrome list = new LinkedListPalindrome();
        System.out.println(list.isPalindrome(node));

        //System.out.println("Linked List after deletion of middle");
        //printList(node);
    }
}
