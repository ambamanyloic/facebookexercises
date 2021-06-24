package com.loic.projectfacebook.leetcode.easy;

import java.util.*;

public class MoveZeroes {

    public ArrayList<Integer> moveZeroes(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        int position =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0) {
                nums[position] = nums[i];
                list.add(nums[position]);
                position++;
            }
        }

        for(;position<nums.length;position++)
            nums[position] = 0;
            //list.add(nums[position]);


    return list;


    }

    public static void main(String[] args) {

        MoveZeroes zero = new MoveZeroes();
        int[] int_array = {0,1,0,3,12};
        System.out.println(zero.moveZeroes(int_array));

    }
}
