package com.loic.projectfacebook.leetcode.medium;

import java.util.*;
import java.util.ArrayList;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) throws NullPointerException {


        //WAY FASTER than second implementation below --> 17 ms faster than 92%
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res);
            }
        return res;
    }
    void twoSumII(int[] nums, int i, List<List<Integer>> res) {
            int lo = i + 1, hi = nums.length - 1;
                while (lo < hi) {
                    int sum = nums[i] + nums[lo] + nums[hi];
                        if (sum < 0) {
                            ++lo;
                        } else if (sum > 0) {
                            --hi;
                        } else {
                            res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                        while (lo < hi && nums[lo] == nums[lo - 1])
                             ++lo;
                    }
                }
    }

    /*second solution WITH int complement = -nums[i] - nums[j]; SIMILAR to TwoSum

     public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);

     */

        public static void main(String [] args) {

         ThreeSum sum = new ThreeSum();
         int[] arr_list = {-1,0,1,2,-1,-4};

         System.out.println(sum.threeSum(arr_list));


        }


    }
