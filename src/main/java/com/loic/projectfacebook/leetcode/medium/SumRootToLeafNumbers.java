package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class SumRootToLeafNumbers {

    List<String> result = new ArrayList<>();

    public int sumNumbers(TreeNode root) {

        int value = 0;

        if (root != null) {

            value = helper(root.right) + helper(root.left);

        }

        return value;
    }

    public int helper(TreeNode node){

        StringBuilder build = new StringBuilder();
        String str = "";
        int new_val = 0;

        if(node != null) {


            build.append(node.toString());

        }

        str += build.toString();

        new_val = Integer.valueOf(str);

        return new_val;

        //MY OWN IMPLEMENTATION BELOW

        /*
        int rootToLeaf = 0;

    public int sumNumbers(TreeNode root) {

        if(root == null) { return -1;}

        return inorder(root,0);
    }

    public int inorder(TreeNode root,int currNumber) {

        currNumber = currNumber * 10 + root.val;

            int left = 0;
            int right = 0;

            while (root == null) { return -1; }

            if(root.left == null && root.right == null){
                return currNumber;
            }
            if(root.left != null){
                left = inorder(root.left,currNumber);
            }
            if(root.right != null) {
                right =  inorder(root.right,currNumber);
            }
            return left + right;
         */
    }


    public static void main(String [] args){

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);


       SumRootToLeafNumbers sum = new SumRootToLeafNumbers();
       System.out.println(sum.sumNumbers(root));

    }
}
