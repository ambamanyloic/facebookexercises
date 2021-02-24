package com.loic.projectfacebook.leetcode.easy;

import java.util.*;

public class MoveZeroes {

    public List<Integer> moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
                nums[j--] = 0;

            }
            j++;
        }

        return list;

    }

    public static void main(String[] args) {

        MoveZeroes zero = new MoveZeroes();
        int[] int_array = {0,1,0,3,12};
        System.out.println(zero.moveZeroes(int_array));

    }
}
