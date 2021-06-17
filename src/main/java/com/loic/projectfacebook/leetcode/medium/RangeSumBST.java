package com.loic.projectfacebook.leetcode.medium;

public class RangeSumBST {
    int value ;
    public int rangeSumBST(TreeNode root, int low, int high) {

        value = 0;
        if(root == null){
            return -1;
        }

        SumBST(root ,low, high);

        return value;
    }

    public void SumBST(TreeNode node , int low,int high) {

        if(node != null) {

            if(low <= node.val && node.val <= high)

                value += node.val;

            if(low < node.val)
                SumBST(node.left,low,high);

            if(node.val < high)
                SumBST(node.right,low,high);
        }
    }
}
