package com.loic.projectfacebook.leetcode.basic;

public class TestSum {
    public int testSum(int[] nums,int target) {

        int sum = 0;
        int count = 0;

        for(int start = 0;start<nums.length;start++){
            for(int end = start;end<nums.length;end++){

                sum += nums[end];

                if(sum == target){
                    count++;
                }

            }
        }

        return count;
    }

    public static void main(String[] args){
        TestSum sum = new TestSum();
        int [] array = {1,1,2,4,6};
        System.out.println(sum.testSum(array,2));
    }
}
