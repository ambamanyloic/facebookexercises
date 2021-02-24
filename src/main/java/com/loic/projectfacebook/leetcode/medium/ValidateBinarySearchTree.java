package com.loic.projectfacebook.leetcode.medium;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {

        return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }

    private boolean isValidBST(TreeNode root,int min,int max) {
        if(root == null) {

            return true;
        }
        if (root.val < min || root.val > max)
            return false;

        return (isValidBST(root.left,min,root.val-1) && isValidBST(root.right,root.val+1,max));

    }
}
