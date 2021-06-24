package com.loic.projectfacebook.crackingcode.linkedlists;



public class DeleteMiddleNode {

    public boolean deleteNode(ListNode head) {

        if(head == null) return false;

        ListNode runner = head.next;
        head.value = runner.value;
        head.next = runner.next;

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

        ListNode node = new ListNode(2);
        node.next = new ListNode(7);
        node.next.next = new ListNode(6);
        node.next.next.next = new ListNode(4);

        System.out.println("Given Linked List");
        printList(node);

        DeleteMiddleNode mid = new DeleteMiddleNode();
        mid.deleteNode(node);

        System.out.println("Linked List after deletion of middle");
        printList(node);
    }



}
