package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        int maxlevel = 0;
        int level = 0;

        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i =0;i<size;i++){

                TreeNode current = queue.remove();

                max = Math.max(max,current.val);

                if(current.left != null)
                    queue.add(current.left);

                if(current.right != null)
                    queue.add(current.right);

            }

            list.add(max);
        }
        return list;
    }

    public static void main(String[] args){

        FindLargestValueEachTreeRow row = new FindLargestValueEachTreeRow();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(3);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(5);
        node.left.right = new TreeNode(3);
        node.right.right = new TreeNode(9);

        System.out.println(row.largestValues(node));

    }
}
