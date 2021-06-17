package com.loic.projectfacebook.leetcode.medium;

import java.util.*;


public class PostOrder {

    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        if (root != null) {

            helper(root);
        }

        return result;
    }

    public void helper(TreeNode node){

        if(node.left != null){
            helper(node.left);
        }
        if(node.right != null){
            helper(node.right);
        }

        result.add(node.val);

    }

    public static void main(String [] args){

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(7);

        PostOrder post_order = new PostOrder();
        System.out.println(post_order.postorderTraversal(root));

    }
}
