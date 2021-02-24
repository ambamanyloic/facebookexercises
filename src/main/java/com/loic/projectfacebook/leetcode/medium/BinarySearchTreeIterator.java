package com.loic.projectfacebook.leetcode.medium;

import java.util.Stack;

public class BinarySearchTreeIterator {

    Stack<TreeNode> stack = new Stack<TreeNode>();

    public BinarySearchTreeIterator(TreeNode root) {
        pushToLeft(root);
    }/** @return whether we have a next smallest number */
    public boolean hasNext(){
        if(stack.empty()){
            return false;
        }return true;
    }/** @return the next smallest number */
    public int next(){
        TreeNode node = stack.pop();
        pushToLeft(node.right);
        return node.val;
    }

    private void pushToLeft(TreeNode node){
        if (node != null){
            stack.push(node);
            pushToLeft(node.left);
        }

    }

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(2);

        BinarySearchTreeIterator tree = new BinarySearchTreeIterator(node1);


        if(tree.hasNext()) {

            System.out.println(tree.next());
        }
    }
}
