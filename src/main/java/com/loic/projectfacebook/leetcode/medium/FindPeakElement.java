package com.loic.projectfacebook.leetcode.medium;

import com.loic.projectfacebook.leetcode.arrays.FindLengthOfLCIS;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {


        //BRUTE FORCE BELOW FIRST --->
       /* int max = Integer.MIN_VALUE;
        int index = 0;
        int sum = 0;

        for(int i = 0;i<nums.length;i++)
        {

            if(nums[i] > max) {

                max = nums[i];
                index = i;
            }

        }

        return index;*/


       // O(log(n)) SECOOND IMPLEMENTATION -->

        int left = 0;
        int right = nums.length;

        return findPeakElement(nums, left, right);
    }

    public int findPeakElement(int[] nums,int left , int right) {
        int n = nums.length;

       int mid  = left + (right - left) / 2;

       if((mid == 0 || nums[mid] >= nums[mid-1]) && (mid == n-1 || nums[mid] >= nums[mid+1])) {

           return mid;
        }

        if(mid - 1 >= 0 && nums[mid-1] > nums[mid]) {

           return findPeakElement(nums,left,mid-1);
        }

        return findPeakElement(nums,mid+1,right);

    }

    public static void main(String[] args) {

        FindPeakElement peak = new FindPeakElement();
        int[] arr =  {1,2,3,1 };
        System.out.println(peak.findPeakElement(arr));
    }
}
