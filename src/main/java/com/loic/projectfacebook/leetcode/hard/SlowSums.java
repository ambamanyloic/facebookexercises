package com.loic.projectfacebook.leetcode.hard;

import java.util.Arrays;

public class SlowSums {
    int getTotalTime(int[] arr) {
                    Arrays.sort(arr);
                    int size = arr.length;
                    int sum = 0;
                    for(int i=size-1;i>=0;i--){
                        sum += arr[size-1] + arr[i];
                    }
                    return sum;
    }
    public static void main(String [] args){
        SlowSums slow = new SlowSums();
        int [] arr = {4, 2, 1, 3};
        System.out.println(slow.getTotalTime(arr));
    }
}
