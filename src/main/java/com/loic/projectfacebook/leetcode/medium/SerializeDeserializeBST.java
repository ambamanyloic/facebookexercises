package com.loic.projectfacebook.leetcode.medium;

public class SerializeDeserializeBST {

    public String serialize(TreeNode root) {

        StringBuffer buff = new StringBuffer();
        int start = Integer.MIN_VALUE;
        int end = Integer.MAX_VALUE;

        if(root != null) {


            buff.append(root.val);
            buff.append(root.left.val);
            buff.append(root.right.val);

        }


        return buff.toString();

    }

    public int searchBST(int[] array,int start,int end) {

        TreeNode root = null;

        int middle = start + ( end - start) /2;

        if(middle == array[middle])
            middle = root.val;

        if(middle < array[middle])
            searchBST(array,start,middle+1);
        if(middle > array[middle])
            searchBST(array,middle+1 , end);


        return -1;
    }

    public static void main(String [] args) {

        SerializeDeserializeBST ser = new SerializeDeserializeBST();
        TreeNode node = new TreeNode(5);
        System.out.println(ser.serialize(node));
    }
}
