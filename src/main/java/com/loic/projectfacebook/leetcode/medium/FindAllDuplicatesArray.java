package com.loic.projectfacebook.leetcode.medium;

import java.util.*;


public class FindAllDuplicatesArray {

    public List<Integer> findDuplicates(int[] nums) {

            List<Integer> list_set = new LinkedList<>();
            int j =0;
            Arrays.sort(nums);

            for(int i=0;i<nums.length-1;i++){



                if(nums[j] != nums[i+1] ) {

                    j++;
                } else {

                    list_set.add(nums[i+1]);
                    j++;
                }

            }

            return list_set;

        }

    public static void main(String[] args) {


        FindAllDuplicatesArray find = new FindAllDuplicatesArray();
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(find.findDuplicates(arr));
    }
}
