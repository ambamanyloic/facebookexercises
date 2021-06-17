package com.loic.projectfacebook.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersEachNodeII {

        public TreeNode connect(TreeNode root) {

            if(root == null){
                return null;
            }

            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);

            while(queue.size() > 0){

                int size = queue.size();

                for(int i=0;i<size;i++){

                    TreeNode node = queue.remove();

                    if(i < size -1) {
                        node.right = queue.peek();
                    }

                    if(node.left != null){
                        queue.add(node.left);
                    }

                    if(node.right != null){
                        queue.add(node.right);
                    }
                }
            }

            return root;
        }
}
