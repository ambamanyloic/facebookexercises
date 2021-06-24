package com.loic.projectfacebook.leetcode.easy;


public class MinimumDepthBT {
    TreeNode root;
    int minDepth()
    {
        return minDepth(root);
    }

    public int minDepth(TreeNode node) {


        if(node == null) {

        }

        if (node.left == null && node.right == null) { // since no more leaves depth == 1
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;

        if(node.left != null) {

            min_depth = Math.min(minDepth(node.left),min_depth);

            }
        if(node.right != null){
            min_depth = Math.min(minDepth(node.right),min_depth);
        }
        return min_depth +1;

        }

    public static void main(String args[])
    {
        MinimumDepthBT tree = new MinimumDepthBT();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);

        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.minDepth());
    }
}
