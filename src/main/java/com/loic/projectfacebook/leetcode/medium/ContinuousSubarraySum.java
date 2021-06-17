package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {

        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(k != 0){
                sum = sum % k;
            }
            if(map.containsKey(sum)) {
                if(i- map.get(sum) >= 2)
                    return true;
            }else {
                map.put(sum,i);
            }
        }
        return false;
    }
    public static void main(String[] args){
        ContinuousSubarraySum sum = new ContinuousSubarraySum();
        int[] array = {23,2,4,6,7};
        System.out.println(sum.checkSubarraySum(array,6));
    }
}
