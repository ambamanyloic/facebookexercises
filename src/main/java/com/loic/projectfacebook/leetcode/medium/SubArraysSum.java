package com.loic.projectfacebook.leetcode.medium;

import com.loic.projectfacebook.leetcode.arrays.SubarraySum;

import java.util.HashMap;
import java.util.Map;

public class SubArraysSum {
    public int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {

                if (map.containsKey(k-nums[j])) {
                    map.put(k-nums[j],map.get(k-nums[j]+1));
                    count++;
                } else {

                    map.put(k-nums[j],1);

                }
            }
        }

        return count;

    }

    public static void main(String[] args){

        SubarraySum sum = new SubarraySum();
        int[] arr = {1,1,1};

        System.out.println(sum.subarraySum(arr,2));

    }
}
