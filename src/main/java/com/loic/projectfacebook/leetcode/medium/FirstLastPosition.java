package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.*;

public class FirstLastPosition {

    public List  searchRange(int[] nums, int target) {

        int start = -1, end = -1;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++) {

            if (nums[i] == target) {
                start = i;

            }
        }
        list.add(start);

            for(int j=nums.length-1;j>=0;j--) {

                if(nums[j] ==  target) {
                   end = j;
                }
            }
        list.add(end);

            /*int [] result = new int[list.size()];

            int k =0;

        for(int l : result) {

            result[k++] = l;
        }

        return result;*/

            return list;

    }

    public static void main(String[] args) {


        FirstLastPosition flast = new FirstLastPosition();
        int [] new_array = {5,7,7,8,8,10};
        System.out.println(flast.searchRange(new_array,8));
    }
}
