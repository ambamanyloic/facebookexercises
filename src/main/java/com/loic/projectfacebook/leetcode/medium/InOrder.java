package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class InOrder {

    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root != null) {

            helper(root);
        }

        return result;
    }

    public void helper(TreeNode node){

        if(node.left != null){

            helper(node.left);
        }

        result.add(node.val);

        if(node.right != null) {

            helper(node.right);
        }

    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InOrder in_order = new InOrder();
        System.out.println(in_order.inorderTraversal(root));


    }
}
