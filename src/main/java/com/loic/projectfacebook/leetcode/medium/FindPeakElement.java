package com.loic.projectfacebook.leetcode.medium;

import com.loic.projectfacebook.leetcode.arrays.FindLengthOfLCIS;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        return search(nums, 0, nums.length - 1);
    }


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

    public int search(int[] nums, int l, int r) {
        if (l == r)
            return l;
        int mid = (l + r) / 2;
        if (nums[mid] > nums[mid + 1])
            return search(nums, l, mid);
        return search(nums, mid + 1, r);

    }

    public static void main(String[] args) {

        FindPeakElement peak = new FindPeakElement();
        int[] arr =  {1,2,3,1 };
        System.out.println(peak.findPeakElement(arr));
    }
}
