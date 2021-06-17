package com.loic.projectfacebook.leetcode.hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NumberVisibleNodes {

    int visibleNodes(Node root) {


        ArrayList<Integer> list = new ArrayList<Integer>();

        Queue<Node> q = new LinkedList<Node>();
        int count = 0;

        if (root == null) {
            return -1;
        }

        q.add(root);

        while (q.size() > 0) {
            int level = q.size();

            for (int i = 1; i < level; i++) {
                Node node = q.remove();

                if (i == 1) //if its the rightest most side of the tree
                    list.add(node.data);
                count++;

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);

            }
        }
        return count;
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
