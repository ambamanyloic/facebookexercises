package com.loic.projectfacebook.leetcode.medium;

import java.util.*;


public class Subsets {
    List<List<Integer>> output = new ArrayList<>();
    int k;
    public List<List<Integer>> subsets(int[] nums) {
        for(k=0;k<nums.length+1;++k){
            backtrack(0,new ArrayList<Integer>(),nums);
        }
        return output;

        }
    public void backtrack(int first,List<Integer> list,int[] nums){
        if(list.size()  == k){
            output.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i=first;i<nums.length;++i){
            list.add(nums[i]);
            backtrack(i+1,list,nums);

            list.remove(list.size()-1);
        }

    }
}
