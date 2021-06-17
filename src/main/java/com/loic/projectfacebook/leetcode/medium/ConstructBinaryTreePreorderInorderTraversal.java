package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreePreorderInorderTraversal {

    Map<Integer,Integer> indexMap = new HashMap<>();

    private int preorderIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        preorderIndex = 0;

        for(int i=0;i<inorder.length;i++){
            indexMap.put(inorder[i],i);
        }

        return arrayToTree(preorder,0,preorder.length-1);

    }

    public TreeNode arrayToTree(int[] preorder,int left,int right){

        if(left > right){
            return null;
        }

        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        root.left = arrayToTree(preorder,left,indexMap.get(rootValue)-1);

        root.right = arrayToTree(preorder,indexMap.get(rootValue)+1,right);

        return root;
    }
}
