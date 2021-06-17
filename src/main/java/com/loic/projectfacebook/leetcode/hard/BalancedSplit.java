package com.loic.projectfacebook.leetcode.hard;

import java.util.Arrays;

public class BalancedSplit {
    boolean balancedSplitExists(int[] arr) {
        // Write your code here
        Arrays.sort(arr);
        int len = arr.length;
        int left = 1;
        int right = len-1;
        int leftSum =arr[0];
        int rightSum = arr[len-1];

        while(left < right) {
            while(leftSum < rightSum  && leftSum < rightSum) {
                leftSum += arr[left++];
            }
            while(left < right && leftSum > rightSum){
                rightSum += arr[--right];
            }

            if (leftSum == rightSum){
                return left == right;
            }

        }
        return leftSum == rightSum &&  arr[left]!=arr[right];

    }
    public static void main(String[] args){
        BalancedSplit balance = new BalancedSplit();
        int[] array = {2, 1, 2, 5};
        System.out.println(balance.balancedSplitExists(array));
    }
}
