package com.loic.projectfacebook.leetcode.easy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }

        }
        return j + 1;
    }

    public static void main(String[] args) {

        int[] num_arr = {1,1,2};
        RemoveDuplicates dup = new RemoveDuplicates();
        System.out.println(dup.removeDuplicates(num_arr));

    }
}
