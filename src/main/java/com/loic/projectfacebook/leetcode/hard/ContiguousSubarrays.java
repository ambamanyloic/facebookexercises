package com.loic.projectfacebook.leetcode.hard;

import java.util.Arrays;

public class ContiguousSubarrays {

    public int countSubarrayLeft(int[] arr,int limit,int i){
        int s = 0;
        int left = arr[i];
        int step = 0;
        while(i>= 0 && i < arr.length) {
            if(arr[i] > left){
                s++;
            }
            i += step;
        }
        return s;
    }
    public int countSubarrayRight(int[] arr,int i,int limit){
        int s = 0;

        int right = arr[arr.length];
        int step = 0;
        while(i>= 0 && i < arr.length) {
            if(arr[i] < right){
                s++;
            }
            i += step;
        }
        return s;
    }


    int[] countSubarrays(int[] arr) {

        int n = arr.length;
        if(arr == null){
            return null;
        }
        int[] result = new int[arr.length];
        Arrays.fill(result,1);

        for(int i=0;i<arr.length;i++){
            result[i] += countSubarrayLeft(arr,0,i);
            result[i] += countSubarrayRight(arr,i,arr.length);
        }
        return result;
    }

    public static void main(String [] args) {

        ContiguousSubarrays sub = new ContiguousSubarrays();
        int[] array = {3, 4, 1, 6, 2};
        System.out.print(sub.countSubarrays(array));


    }


}
