package com.loic.projectfacebook.leetcode.medium;

import com.loic.projectfacebook.leetcode.arrays.SubarraySum;

import java.util.HashMap;
import java.util.Map;

public class SubArraysSum {
    public int subarraySum(int[] nums, int k) {

        //O(n^2) look below for 0(n) implementation

        /*Map<Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int start = 0;start<nums.length;start++){
            int sum = 0;
            for(int end = start;end < nums.length;end++) {

                sum += nums[end];

                if (sum == k)
                    count++;
            }

        }
        return count;
        */



        //O(n) but this solution needs to be discussed AND UNDERSTOOD

        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }

    public static void main(String[] args){

        SubarraySum sum = new SubarraySum();
        int[] arr = {1,1,1};

        System.out.println(sum.subarraySum(arr,2));

    }
}
