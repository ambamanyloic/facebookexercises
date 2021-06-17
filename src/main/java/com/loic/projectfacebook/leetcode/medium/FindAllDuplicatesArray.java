package com.loic.projectfacebook.leetcode.medium;

import java.util.*;


public class FindAllDuplicatesArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list_set = new LinkedList<Integer>();
        int j =0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                list_set.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        /*for(int i=1;i<nums.length;i++){
            if(nums[j] != nums[i] ) {
                j++;
            } else {
                list_set.add(nums[i]);
                j++;
            }
        }*/

        return list_set;

        }

    public static void main(String[] args) {


        FindAllDuplicatesArray find = new FindAllDuplicatesArray();
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(find.findDuplicates(arr));
    }
}
