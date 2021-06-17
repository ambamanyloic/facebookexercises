package com.loic.projectfacebook.leetcode.medium;


public class SearchRotatedArray {
    public int search(int[] nums, int target) {

        //BRUTE FORCE

        /*int num = -1;

        for(int i =0;i<nums.length;i++){
            if(nums[i] == target) {

                num = i;
            }
        }

        return num;*/

        //BINARY SEARCH -> O(log*N)

        int start = 0;
        int end = nums.length -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] == target)
                return mid;

            else if (nums[mid] >= nums[start]) {


                if(target >= nums[start] && target < nums[mid]) end = mid -1;
                else start = mid + 1;

            } else {
                if(target <= nums[end] && target > nums[mid]) start = mid +1;
                else end = mid -1;
                }
            }

            return -1;

    }

    public static void main(String args[]){

        SearchRotatedArray search = new SearchRotatedArray();
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search.search(arr,3));

    }
}
