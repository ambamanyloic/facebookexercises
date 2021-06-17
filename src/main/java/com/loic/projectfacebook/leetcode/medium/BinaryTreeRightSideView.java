package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int temp = 0;

        if(root == null) {
            return list;
        }

        q.add(root);

        while(q.size() > 0)
        {
            int size = q.size();

            for(int i=0;i<size;i++)
            {
                TreeNode node = q.remove();

                if(i == size-1) //if its the rightest most side of the tree
                    list.add(node.val);

                if(node.left != null)
                    q.add(node.left);

                if(node.right != null)
                    q.add(node.right);

            }
        }
        return list;

    }
}
