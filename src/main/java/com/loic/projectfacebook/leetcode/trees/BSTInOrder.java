package com.loic.projectfacebook.leetcode.trees;

import java.util.*;

public class BSTInOrder {

    Node root = null;

     void InOrder(Node node){

        if(node == null) {

            return;
        }

        InOrder(node.left);

        System.out.print(node.value + "->");

        InOrder(node.right);

    }

    void PostOrder(Node node){


        if(node == null) {

            return;
        }

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value + "->");


    }

    void PreOrder(Node node) {

        if(node == null) {

            return;
        }

        System.out.print(node.value + "->");
        PreOrder(node.left);
        PreOrder(node.right);

    }


    public static void main(String[] args) {
        BSTInOrder tree = new BSTInOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder traversal");
        tree.InOrder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.PreOrder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.PostOrder(tree.root);
    }

}
