package com.loic.projectfacebook.leetcode.easy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
           return new int[]{0,0};


        //ArrayList<Integer> arr_list = new ArrayList<>();
        int [] result = null;
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                result = new int[] { numMap.get(complement), i };

            } else {
                numMap.put(nums[i], i);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        TwoSum sum = new TwoSum();
        int[] new_array = {3,3};
        System.out.println(sum.twoSum(new_array,6));
    }

}
