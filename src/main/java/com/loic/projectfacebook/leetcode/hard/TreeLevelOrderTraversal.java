package com.loic.projectfacebook.leetcode.hard;

import java.util.*;

public class TreeLevelOrderTraversal {
    public List<Integer> levelOrder(TreeNode root) {

        //PriorityQueue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> levels = new ArrayList<>();

        queue.add(root);

        while(queue.size() > 0){
            int len = queue.size();

            for(int i=0;i<len;i++){
                TreeNode current = queue.poll();
                levels.add(current.val);

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }

            }
        }
        return levels;

    }

    public static void main(String[] args) {
        TreeLevelOrderTraversal order = new TreeLevelOrderTraversal();
        TreeNode one = new TreeNode(1);
        one.right = new TreeNode(2);
        one.right.right = new TreeNode(5);
        one.right.right.left = new TreeNode(3);
        one.right.right.right = new TreeNode(6);
        one.right.right.left.right = new TreeNode(4);

        System.out.println(order.levelOrder(one));
    }
}
