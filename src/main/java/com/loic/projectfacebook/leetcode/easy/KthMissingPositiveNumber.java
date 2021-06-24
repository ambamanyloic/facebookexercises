package com.loic.projectfacebook.leetcode.easy;

public class KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {

        //FORGET THIS ONE : GO TO LEETCODE BINARYSEARCH INSTEAD

        if(k <= arr[0] -1){
            return k;
        }

        k-= arr[0] -1;

        int n = arr.length;

        for(int i=0;i<arr.length;++i){
            int currMissing = arr[i+1] - arr[i] -1;

            if(k<=currMissing){
                return arr[i] +k;
            }

            k-=currMissing;
        }

        return arr[n - 1] + k;

    }

    public static void main(String[] args){

        KthMissingPositiveNumber number = new KthMissingPositiveNumber();
        int[] arr = {2,3,4,7,11};
        System.out.println(number.findKthPositive(arr,5));
    }
}
