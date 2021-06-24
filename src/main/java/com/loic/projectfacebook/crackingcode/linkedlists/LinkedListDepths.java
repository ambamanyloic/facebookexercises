package com.loic.projectfacebook.crackingcode.linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDepths {

    public ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {

        LinkedList<TreeNode> list = null;

        if (root == null) {
            return null;
        }

        if (lists.size() == level) {

            list = new LinkedList<>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }

        list.add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
        lists = createLevelLinkedList(root);

        return lists;

    }

    public ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {

        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    public static void main(String[] args){

        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(8);

        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        LinkedList<TreeNode> tree = new LinkedList<>();
        tree.add(node);
        lists.add(tree);

        LinkedListDepths depth = new LinkedListDepths();
        System.out.println(depth.createLevelLinkedList(node,lists,1));
    }
}
