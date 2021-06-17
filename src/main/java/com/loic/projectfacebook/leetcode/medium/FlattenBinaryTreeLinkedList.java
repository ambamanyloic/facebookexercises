package com.loic.projectfacebook.leetcode.medium;

import java.util.LinkedList;

public class FlattenBinaryTreeLinkedList {

    public TreeNode flatten(TreeNode root) {

        LinkedList<TreeNode> list = new LinkedList<>();

        TreeNode node = root;

        if(node == null) { return null; }

        if(node.right == null && node.right == null) {

            return node;
        }

        TreeNode left_node =  flatten(node.left);


        TreeNode right_node = flatten(node.right);

        if(left_node != null) {
            left_node.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        return right_node == null ? left_node : right_node;

    }
}
