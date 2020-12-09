package com.loic.projectfacebook.leetcode.easy;

public class BinarySearchTree {

    public int binarySearchTree(int [] nums,int x){

        int n = nums.length;

        return binarySearchTree(nums,0,n,x);

    }

    public int binarySearchTree(int [] nums,int start,int end,int x){

        int mid = start - (end - start) /2;

        if(nums[mid] == x) {

            return  nums[mid];
        } else if (nums[mid] > x) {

            return binarySearchTree(nums,start,mid-1,x);
        } else {

            return binarySearchTree(nums,mid+1,end,x);
        }

    }
}
