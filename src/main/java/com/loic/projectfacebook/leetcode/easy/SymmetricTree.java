package com.loic.projectfacebook.leetcode.easy;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if(root == null){
            return true;
        }

        return isSymmetric(root,root);
    }

    public boolean isSymmetric(TreeNode tree1, TreeNode tree2){

        if(tree1 == null && tree2 == null){
            return true;
        }

        if(tree1 == null || tree2 == null){
            return false;
        }

        return (tree1.val == tree2.val )
                && isSymmetric(tree1.right,tree2.left)
                && isSymmetric(tree1.left,tree2.right);

    }

    public static void main(String[] args) {


        /*

                                1
                                -
                               -  -
                              -   -
                             2      2
                            -        -
                           -          -
                      3      4    4       3

         */

        TreeNode root = new TreeNode(1);

        SymmetricTree tree = new SymmetricTree();

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);

        System.out.println(tree.isSymmetric(root));



    }
}
