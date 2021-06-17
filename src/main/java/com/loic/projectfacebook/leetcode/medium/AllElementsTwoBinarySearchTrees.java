package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementsTwoBinarySearchTrees {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> list = new ArrayList<>();

        inorder(root1,list);
        inorder(root2,list);

        Collections.sort(list);

        return list;
    }

    public List<Integer> inorder(TreeNode root,List<Integer> arr){

        if(root == null) {
            return arr;
        }

        if(root.left != null){
            inorder(root.left,arr);
        }

        arr.add(root.val);

        if(root.right != null){
            inorder(root.right,arr);
        }

        return arr;
    }
}
