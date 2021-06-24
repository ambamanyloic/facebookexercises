package com.loic.projectfacebook.leetcode.easy;

import java.util.*;

public class TwoSumII {
    public int []twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length-1;
        while(low< high){

            int sum = numbers[low] + numbers[high];

            if(sum < target) {
                low++;
            }else if (sum > target) {
                high--;
            } else {
                return new int[] {low+1,high+1};
            }
        }

        return new int[] {-1,-1};
    }

    public static void main(String [] args){
        TwoSumII sum = new TwoSumII();
        int[] array = {2,7,11,15};
        System.out.println(sum.twoSum(array,9));
    }
}
