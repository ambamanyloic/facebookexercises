package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class KthSmallestElementBST {

    public int kthSmallest(TreeNode root, int k) {

       /* ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());

        return nums.get(k - 1);
    }

    public ArrayList<Integer> inorder(TreeNode node, ArrayList<Integer> arr){

        if(node == null) { return null; }

        inorder(node.left,arr);
        arr.add(node.val);
        inorder(node.right,arr);

        return arr;*/

        //Iterative approach : I actually like it better

        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0) return root.val;
            root = root.right;
        }

    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);

        KthSmallestElementBST smallest = new KthSmallestElementBST();
        System.out.println(smallest.kthSmallest(root,3));
    }
}