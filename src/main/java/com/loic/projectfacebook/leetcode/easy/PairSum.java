package com.loic.projectfacebook.leetcode.easy;

import java.util.*;


public class PairSum {
    int numberOfWays(int[] arr, int k) {
        // Write your code here
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = k - arr[i];

            if(map.containsKey(complement)) {
                count += map.get(complement);
            } else {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PairSum pair = new PairSum();
        int[] array_test = {1, 5, 3, 3, 3};
        System.out.println(pair.numberOfWays(array_test,6));
    }

}
