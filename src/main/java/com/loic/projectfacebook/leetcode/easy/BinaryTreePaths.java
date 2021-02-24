package com.loic.projectfacebook.leetcode.easy;

import java.util.*;

public class BinaryTreePaths {

    List<String> list = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return list;
        }
        addToPath(root, "",list);
        return list;
    }


    private void addToPath(TreeNode node, String s,List<String> list) {

        s += node.val;

        if (node.left == null && node.right == null) {
            list.add(s);
            return;
        }

        if (node.left != null) {
            addToPath(node.left,  s + "->",list);
        }
        if (node.right != null) {
            addToPath(node.right,  s + "->",list);
        }

}

    public static void main(String[] args) {

        BinaryTreePaths paths = new BinaryTreePaths();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(5);
        paths.binaryTreePaths(node1);
        paths.binaryTreePaths(node2);
        paths.binaryTreePaths(node3);
        System.out.println(paths.binaryTreePaths(node4));
    }
}
