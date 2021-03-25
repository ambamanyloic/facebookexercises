package com.loic.projectfacebook.leetcode.medium;

public class RotatedSortedArray {

    public int findElemInRoatedSortedArray(int[]nums, int target) {

        int n = nums.length;
        int val;

      val = BinarySearch(nums, 0, n, target);

      return val;
    }

    public int BinarySearch(int[] nums,int start,int end,int target){

        int middle = start + (end - start) /2;

        if(nums[middle] ==target) {

            return middle;
        } else if(nums[start] <= nums[middle] ){

            if(target >= nums[start] && nums[middle] >= target) {

            //return BinarySearch(nums, start, middle-1, target);
                return BinarySearch(nums, middle + 1, end, target);
            }
        } else if(nums[end] >= nums[middle]) {

            if (target <= nums[end] && nums[middle] <= target) {

                //return BinarySearch(nums, middle + 1, end, target);
                return BinarySearch(nums, start, middle - 1, target);


            }
        } else {
                end = middle;
            }

            return -1;
        }
        public static void main(String[] args) {


        RotatedSortedArray sort = new RotatedSortedArray();
        int [] array = {3,4,5,1,2};
        System.out.println(sort.findElemInRoatedSortedArray(array,3));

        }
}
