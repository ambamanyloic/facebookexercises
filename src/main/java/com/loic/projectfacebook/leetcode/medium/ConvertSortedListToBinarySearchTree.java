package com.loic.projectfacebook.leetcode.medium;

public class ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {

        if(head == null) {
            return null;
        }

        ListNode mid = this.findMiddleElement(head);

        TreeNode node = new TreeNode(mid.val);

        if(head == mid) {
            return node;
        }

        node.left =  sortedListToBST(head);
        node.right = sortedListToBST(mid.next);

        return node;


    }

    public ListNode findMiddleElement(ListNode head) {


        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while(fast != null & fast.next.next != null) {

            fast = fast.next.next;
            prev = slow;
            slow = slow.next;

        }

        if(prev != null) {
            prev.next = null;
        }

        ListNode n = new ListNode(slow.val);

        return n;

    }

    /*

    Transform TreeNode into Array approach

    private List<Integer> values;

  public Solution() {
    this.values = new ArrayList<Integer>();
  }

  private void mapListToValues(ListNode head) {
    while (head != null) {
      this.values.add(head.val);
      head = head.next;
    }
  }

  private TreeNode convertListToBST(int left, int right) {
    // Invalid case
    if (left > right) {
      return null;
    }

    // Middle element forms the root.
    int mid = (left + right) / 2;
    TreeNode node = new TreeNode(this.values.get(mid));

    // Base case for when there is only one element left in the array
    if (left == right) {
      return node;
    }

    // Recursively form BST on the two halves
    node.left = convertListToBST(left, mid - 1);
    node.right = convertListToBST(mid + 1, right);
    return node;
  }

  public TreeNode sortedListToBST(ListNode head) {

    // Form an array out of the given linked list and then
    // use the array to form the BST.
    this.mapListToValues(head);

    // Convert the array to
    return convertListToBST(0, this.values.size() - 1);


     */




    static void printList(ListNode ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {
        /* Start with the empty list */
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ConvertSortedListToBinarySearchTree convert = new ConvertSortedListToBinarySearchTree();

        System.out.println("Given Linked List");
        printList(head);

        //head = convert.sortedListToBST(head);

        System.out.println("Linked List after deletion of middle");
        printList(head);
    }



}
