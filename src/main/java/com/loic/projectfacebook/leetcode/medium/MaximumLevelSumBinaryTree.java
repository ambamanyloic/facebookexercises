package com.loic.projectfacebook.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumBinaryTree {

    public int maxLevelSum(TreeNode root) {

        if(root == null){
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        int max = 0;
        int minlevel=0;

        while(!queue.isEmpty()){

            int size = queue.size();
            int sum = 0;
            level++;

            for(int i=0;i<size;i++){

                TreeNode current = queue.remove();

                if(current.left !=null)
                    queue.add(current.left);
                if(current.right != null)
                    queue.add(current.right);
                sum += current.val;
            }

            if(sum > max) {
                max = sum;
                minlevel=level;
            }
        }
        return minlevel;
    }
}
