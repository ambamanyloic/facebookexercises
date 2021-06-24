package com.loic.projectfacebook.crackingcode.trees;

import java.util.*;


public class GraphBFS {

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
        public Node(int val,ArrayList<Node> _children) {

            this.val = val;
            children = _children;
        }
    }

    public boolean isBFS(Node startNode,Node endNode) {

        if(startNode == null && endNode == null){

        }

        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> visited = new HashSet<Node>();
        queue.add(startNode);


        while(!queue.isEmpty()) {

            Node current = queue.remove();

            if(current.val == endNode.val ) {

                return true;
            }

                for(int i=0;i<current.children.size();i++){

                    Node neighbours = current.children.get(i);

                    if(!visited.contains(neighbours.children.get(i)))    {

                        queue.add(neighbours.children.get(i));
                    }

                }

                visited.add(current);

        }

        return false;

    }

    static void printList(Node ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node node = new Node(4);
        node.next = new Node(5);
        node.next.next = new Node(9);
        Node startNode = node.next.next;
        node.next.next.next = new Node(4);
        Node endNode = node.next.next.next;

        System.out.println("Given Linked List");
        printList(node);

        GraphBFS graph = new GraphBFS();
        graph.isBFS(startNode,endNode);



        System.out.println("Linked List after deletion of middle");
        printList(node);
    }


}
