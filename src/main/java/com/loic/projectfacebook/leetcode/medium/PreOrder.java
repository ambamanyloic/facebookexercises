package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class PreOrder {

    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        if (root != null) {

            helper(root);
        }

        return result;
    }

    public void helper(TreeNode node){

        result.add(node.val);

        if(node.left != null) {
            helper(node.left);
        }

        if(node.right != null) {
            helper(node.right);
        }
    }

    public static void main(String [] args){

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(3);

        PreOrder pre_order = new PreOrder();
        System.out.println(pre_order.postorderTraversal(root));

    }
}
