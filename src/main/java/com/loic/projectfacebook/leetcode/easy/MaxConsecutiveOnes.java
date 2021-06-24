package com.loic.projectfacebook.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                // Increment the count of 1's by one.
                count += 1;
            } else {
                // Find the maximum till now.
                maxCount = Math.max(maxCount, count);
                // Reset count of 1.
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }
    public static void main(String [] args){
        MaxConsecutiveOnes ones = new MaxConsecutiveOnes();
        int[] array_num = {1,1,0,1,1,1};
        System.out.println(ones.findMaxConsecutiveOnes(array_num));
    }
}
