package com.loic.projectfacebook.leetcode.medium;


public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {

        int size = nums.length;

        if (nums == null || size == 0) {
            return 0;
        }


        int end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

            for (int start = 0; start < size; start++) {

                sum += nums[start];

                while (sum >= target) {

                    min = Math.min(min,start + 1 - end);
                    sum -= nums[end];
                    end++;
                }

            }

            return min;


    }

    public static void main(String [] args) {

        MinimumSizeSubarraySum min = new MinimumSizeSubarraySum();
        int[] array_sum = {2,3,1,2,4,3};
        System.out.println(min.minSubArrayLen(7,array_sum));

    }
}
