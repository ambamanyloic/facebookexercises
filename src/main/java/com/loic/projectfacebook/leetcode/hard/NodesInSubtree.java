package com.loic.projectfacebook.leetcode.hard;

import java.util.*;

public class NodesInSubtree {
    static class Node {
        int val;
        Node next;
        List<Node> children; // Edges in the graph to other vertices

        public Node() {
            children = new ArrayList<>();
        }

        public Node(int val) {

            this.val = val;
            children = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> _children) {

            this.val = val;
            children = _children;
        }
    }

    class Query {
        int u;
        char c;

        Query(int u, char c) {
            this.u = u;
            this.c = c;
        }

        public char get_u(ArrayList<Query> queries) {
            char c = 'b';
            for (Query query : queries) {
                c = query.c;
            }
            return c;
        }
    }

    public int[] countOfNodes(Node root, ArrayList<Query> queries, String s) {
        // Write your code here
        int[] result = new int[1];
        int count = 0;
        if (root == null) {
            return result;
        }

        Map<Character,Integer> map = new HashMap<>();
        char[] s_chars = s.toCharArray();
        for(char c: s_chars){
            map.put(c,map.getOrDefault(c,1)+1);
        }

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Character> list = new ArrayList<>();
        char [] array_char = s.toCharArray();
        for(char c : array_char){
            list.add(c);
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            //ArrayList<Node> children = new ArrayList<>();
            Node current = queue.remove();
            for (int i = 0; i < current.children.size(); i++) {
                Node neighbours = current.children.get(i);
                //for (Query query : queries)
                    //if (neighbours.children.get(i)query.get_u(queries))
                   // if (!(query.get_u(queries) == neighbours.children.get(i))) {

                    //} else {
                    //    count = count + 1;
                    //    result = new int[]{count};
                    }
            }

        return result;
    }
}
