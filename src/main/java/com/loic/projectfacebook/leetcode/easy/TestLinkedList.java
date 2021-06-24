package com.loic.projectfacebook.leetcode.easy;
import java.util.*;

public class TestLinkedList {

    static ListNode head;

    public List returnList(ListNode head) {

        ListNode current = head;
        List<Integer> list = new ArrayList<>();

        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        return list;
    }

    void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String [] args) {

        TestLinkedList list = new TestLinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(2);
        list.head.next.next.next = new ListNode(1);

        System.out.println(list.returnList(head));

    }
}
