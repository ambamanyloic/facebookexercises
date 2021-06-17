package com.loic.projectfacebook.leetcode.medium;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;

        for(int start=0;start<nums.length;start++){
            int product = 1;
            for(int end =start;end< nums.length;end++) {

                product =  product * nums[end];
                max = Math.max(max,product);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumProductSubarray product = new MaximumProductSubarray();
        int[] array = {2,3,-2,4};
        System.out.println(product.maxProduct(array));
    }
}
