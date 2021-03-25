package com.loic.projectfacebook.leetcode.medium;

import java.util.Arrays;

public class KDiffPairsArray {

    public int findPairs(int[] nums, int k) {

        int count = 0;
        int n = nums.length;
        Arrays.sort(nums); // Sort array elements

        int l = 0;
        int r = 1;
        while(l < n && r < n) {
            if( l == r || nums[r] - nums[l] < k) {
                r++;
            }
            else if(nums[r] - nums[l] > k) {
                l++;
            } else { // arr[r] - arr[l] == k
                l++;
                count++;

                while(l < nums.length && nums[l] == nums[l-1]) {
                    l++;
                }
            }
        }
        return count;
    }
}
