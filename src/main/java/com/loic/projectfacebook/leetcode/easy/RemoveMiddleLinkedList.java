package com.loic.projectfacebook.leetcode.easy;

public class RemoveMiddleLinkedList {

    static ListNode remove(ListNode head) {


        while(head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast != null & fast.next.next != null) {

            fast = fast.next.next;
            prev = slow;
            slow = slow.next;

        }

        prev.next = slow.next;

    return head;

    }


    static void printList(ListNode ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    /* Driver code*/
    public static void main(String[] args)
    {
        /* Start with the empty list */
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Given Linked List");
        printList(head);

        head = remove(head);

        System.out.println("Linked List after deletion of middle");
        printList(head);
    }
}
