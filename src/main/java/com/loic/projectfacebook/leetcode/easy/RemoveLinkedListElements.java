package com.loic.projectfacebook.leetcode.easy;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

            ListNode temp = new ListNode(0);
            temp.next = head;
            head = temp;
            while (head != null && head.next != null){
                if (head.next.val == val){
                    head.next = head.next.next;
                }else{
                    head = head.next;
                }
            }
            return temp.next;

    }

    public static void main(String[] args){

        RemoveLinkedListElements rem = new RemoveLinkedListElements();
        ListNode node = new ListNode(8);
        //System.out.println(rem.removeElements(node));



    }
}
