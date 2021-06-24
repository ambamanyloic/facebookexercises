package com.loic.projectfacebook.crackingcode.linkedlists;


public class KthLastElementLinkedList {

    public ListNode nthTolast(ListNode head, int k) {

        ListNode p1 = head;
        ListNode p2 = head;

        //Move p1 k nodes into the list
        for (int i = 0; i < k; i++) {

            if (p1 == null) return null;

            p1 = p1.next;

        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    static void printKthList(ListNode ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.value + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(5);
        node.next.next = new ListNode(9);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(7);

        System.out.println("Given Linked List before Kth value");
        printKthList(node);

        KthLastElementLinkedList last = new KthLastElementLinkedList();
        last.nthTolast(node,2);

        System.out.println("Linked List after Kth value");
        printKthList(node);
    }

}
