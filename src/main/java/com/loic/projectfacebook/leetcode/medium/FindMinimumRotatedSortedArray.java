package com.loic.projectfacebook.leetcode.medium;

public class FindMinimumRotatedSortedArray {

    public int findMin(int[] nums) {

        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        int l = 0;
        int r = nums.length-1;
        while(r>l){
            int mid = (l+r)/2;
            if(nums[mid]>=nums[0]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return nums[l];

       }

    public static void main(String[] args){

        FindMinimumRotatedSortedArray min = new FindMinimumRotatedSortedArray();
        int[] arr = {3,4,5,1,2};
        System.out.println(min.findMin(arr));
    }
}
