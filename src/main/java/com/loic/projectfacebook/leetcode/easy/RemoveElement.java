package com.loic.projectfacebook.leetcode.easy;

public class RemoveElement {

    public int removeElement(int[] nums,int val){

        int i =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }

    public static void main(String[] args){

        RemoveElement remove = new RemoveElement();
        int[] array = {3,2,2,3};
        System.out.println(remove.removeElement(array,3));

    }
}
