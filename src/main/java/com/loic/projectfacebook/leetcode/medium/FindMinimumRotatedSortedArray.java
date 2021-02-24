package com.loic.projectfacebook.leetcode.medium;

public class FindMinimumRotatedSortedArray {

    public int findMin(int[] nums) {

        if(nums==null || nums.length==0)
            return -1;

        int i = 0;
        int j =nums.length-1;

       while(i<=j) {
           if(nums[i] <= nums[j])
               return nums[i];

           int m=(i+j)/2;

           if(nums[m] >= nums[i])
               i=m+1;
           else
               j=m;

       }

       return -1;
    }

    public static void main(String[] args){

        FindMinimumRotatedSortedArray min = new FindMinimumRotatedSortedArray();
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(min.findMin(arr));
    }
}
