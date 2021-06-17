package com.loic.projectfacebook.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int sum =0;
        int difference = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        int min = 0;
        for(int i=0;i<nums.length;i++){
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                sum = nums[i] + nums[low] +nums[high];
                if(Math.abs(target- sum) < Math.abs(difference))
                    difference = target - sum;
                if(sum < target)
                    low++;
                else
                    high--;
            }
        }
        return difference;
    }
}
