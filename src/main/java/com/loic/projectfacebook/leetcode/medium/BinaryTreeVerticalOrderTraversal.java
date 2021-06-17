package com.loic.projectfacebook.leetcode.medium;

import java.util.*;
import javafx.util.*;

public class BinaryTreeVerticalOrderTraversal {

    public List<List<Integer>> verticalOrder(TreeNode root) {

        /*List<Integer> list_one =  new ArrayList<Integer>();

        return  verticalOrder(root,list_one);

    }

    public List<List<Integer>> verticalOrder(TreeNode root, List<Integer> list) {

        List<List<Integer>> l_list = new ArrayList<>();

        if(root == null) {
            return l_list;
        }

        if(root.left == null || root.right == null) {
            list.add(root.val);
            return l_list;
        }

        if(root.left != null){
            verticalOrder(root.left,list);
        }

        list.add(root.val);


        if(root.right != null){
            verticalOrder(root.right,list);
        }

        l_list.add(list);

        return l_list;*/

            List<List<Integer>> output = new ArrayList<>();
            if(root == null)
                return output;

            Map<Integer,ArrayList> columnTable = new HashMap<>();
            Queue<Pair<TreeNode,Integer>>queue = new ArrayDeque();
            int column = 0;
            queue.add(new Pair(root,column));
            int size = queue.size();
            while(!queue.isEmpty()) {
                Pair<TreeNode,Integer> p = queue.poll();
                root = p.getKey();
                column = p.getValue();

                if(root != null){
                    if(!columnTable.containsKey(column)){
                        columnTable.put(column,new ArrayList<Integer>());
                    }
                    columnTable.get(column).add(root.val);

                    queue.add(new Pair(root.left,column-1));
                    queue.add(new Pair(root.right,column+1));
                }
            }

            List<Integer> sortedKeys = new ArrayList<Integer>(columnTable.keySet());
            Collections.sort(sortedKeys);

            for(int key: sortedKeys){
                output.add(columnTable.get(key));
            }
            return output;


    }

}
