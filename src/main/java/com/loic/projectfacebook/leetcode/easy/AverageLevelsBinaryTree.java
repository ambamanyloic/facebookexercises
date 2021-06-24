package com.loic.projectfacebook.leetcode.easy;
import java.util.*;

public class AverageLevelsBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {

            List<Double> result = new ArrayList<>();
            if (root == null)  {
                return result;
            }

            Queue<TreeNode> queue = new LinkedList<>();

            queue.add(root);

            while (!queue.isEmpty()) {
                int count = queue.size();
                double sum = 0;

                for (int i = 0; i < count; i++) {

                    TreeNode node = queue.remove();
                    sum += node.val;

                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                result.add(sum / count);
            }

            return result;
    }
}
