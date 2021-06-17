package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumSizeSubarraySumEqualsK {
    public int maxSubArrayLen(int[] nums, int k) {

        if (nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> mapCount = new HashMap<>();
        mapCount.put(0, -1);
        int sum = 0, min = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (mapCount.containsKey(sum - k)) {
                min = Math.min(min, i - mapCount.get(sum - k));
            }
            if (!mapCount.containsKey(sum)) {
                mapCount.put(sum, i);
            }
        }
        return min;
    }
    public static void main(String [] args) {
        MinimumSizeSubarraySumEqualsK  min = new MinimumSizeSubarraySumEqualsK();
        int [] array = {2,-1,5,-2,9};
        System.out.print(min.maxSubArrayLen(array,1));
    }
}
