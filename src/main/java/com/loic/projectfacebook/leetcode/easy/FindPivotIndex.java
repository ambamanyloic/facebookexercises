package com.loic.projectfacebook.leetcode.easy;

public class FindPivotIndex {

    int index = -1;

    public int pivotIndex(int[] nums) {

            // Init the left & right sum
            int left = 0, right = 0;
            for(int num : nums) right += num;

            // Scan -> to find where left == right
            for(int i = 0; i < nums.length; i++) {
                // @@: Update, check, update
                right -= nums[i];

                if(left == right) return i;

                left += nums[i];
            }

            return -1;

    }

    public static void main(String[] args) {


        FindPivotIndex pivot = new FindPivotIndex();
        int[] arr = {1,7,3,6,5,6};

        System.out.println(pivot.pivotIndex(arr));
    }

}
