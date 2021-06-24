package com.loic.projectfacebook.crackingcode.linkedlists;

public class RemoveDuplicates {

    static void printList(ListNode ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.value + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public void deleteDups(ListNode head){

        ListNode current = head;

        while(current != null) {


            ListNode runner = current;

            while(runner.next != null) {

                if(runner.next.value == current.value){

                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;

        }

    }

    public static void main(String[] args) {

        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(9);
        node.next.next.next = new ListNode(4);

        System.out.println("Given Linked List");
        printList(node);

        RemoveDuplicates item = new RemoveDuplicates();
        item.deleteDups(node);

        System.out.println("Linked List after deletion of middle");
        printList(node);
    }
}
