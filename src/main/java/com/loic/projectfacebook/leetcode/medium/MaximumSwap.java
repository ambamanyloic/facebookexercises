package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class MaximumSwap {
    public int maximumSwap(int num) {
        String num_str = String.valueOf(num);
        String str = "";
        int max = num;
        char[] nums = num_str.toCharArray();
        String new_str = "";
        for(int i =0;i<nums.length;i++){

            new_str = swap(nums[0],nums[1]) + nums[2] + nums[3];

        }

        int new_max = Integer.valueOf(new_str);

        if(new_max > max) {
            max = new_max;
        }
        return max;

    }

    public String swap(Character c , Character p){

        String str = "";

        char temp = 'b';
        temp = c;
        c = p;
        p = temp;

        return str + c + p;

    }

    public static void main(String [] args) {

        MaximumSwap swap = new MaximumSwap();
        int num = 2736;
        System.out.println(swap.maximumSwap(num));
    }
}
