package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindFirstLastPositionElementSortedArray {
    public int[] searchRange(int[] nums, int target) {


        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int start = first(nums, target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        int end = first(nums, target + 1);
        return new int[]{start, nums[end] == target? end: end-1};
    }

    public int first(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low + 1 < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid;
            } else {
                high = mid;
            }
        }
        if (nums[low] == target) {
            return low;
        }
        return high;

      /*  int j = nums.length - 1;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

                if (nums[i] == target ) {

                    list.add(i);
                }

                if(nums[j] == target) {
                    list.add(j);
                    break;
                }
                if(nums[i] != target && nums[j] == target) {

                    i++;
                    j--;
                }

        }
            return list;*/
    }

    public  static void main(String [] args) {

        FindFirstLastPositionElementSortedArray first = new FindFirstLastPositionElementSortedArray();
        int[] array = {5,8,7,1,6,3,8,10};
        System.out.println(first.searchRange(array,8));
    }
}
