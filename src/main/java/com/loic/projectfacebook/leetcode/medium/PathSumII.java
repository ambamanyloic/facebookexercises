package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        if(root == null) {
            return paths;
        }
        preorder(paths,path,root,targetSum);
        return paths;
    }

    public void preorder(List<List<Integer>> paths,List<Integer> path,TreeNode root,int targetSum)  {
        if(root == null)
            return;

        int sum = 0;

        path.add(root.val);

        if(root.right == null && root.left == null && targetSum == root.val) {
            paths.add(new ArrayList<>(path));

        } else {

            preorder(paths, path,root.left,targetSum - root.val);
            preorder(paths,path,root.right,targetSum - root.val);

        }
        path.remove(path.size() - 1);
    }
}
