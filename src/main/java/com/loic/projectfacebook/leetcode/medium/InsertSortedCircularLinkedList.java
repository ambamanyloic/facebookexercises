package com.loic.projectfacebook.leetcode.medium;

public class InsertSortedCircularLinkedList {
    public ListNode insert(ListNode head, int insertVal) {
        if(head == null) {
            ListNode newNode = new ListNode(insertVal);
            newNode.next = newNode;

            return newNode;
        }

        ListNode cur = head;
        while (true){
            if((cur.val <= insertVal && cur.next.val >= insertVal) || //in between asc
                    (atEnd(cur) && insertVal < cur.next.val) || //at end - insert is less than beginning of asc order
                    (atEnd(cur) && insertVal > cur.val) || //at end - insert is higher than last of asc order
                    (cur.next == head)) { // next is head - edge case for lists of all same number, we've validated the other nodes in the list and couldn't insert so this is the last spot we could do it

                ListNode newNode = new ListNode(insertVal, cur.next);
                cur.next = newNode;
                break;
            } else {
                cur = cur.next;
            }
        }

        return head;

    }

    private boolean atEnd(ListNode n){
        return n.val > n.next.val;

    }
}
