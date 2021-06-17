package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();

        for(int num : nums){
            list.add(num);
        }
        int n = nums.length;

        backtrack(n,list,output,0);

        return output;
    }

    public void backtrack(int n,List<Integer> nums,List<List<Integer>> output,int first) {

        if(first == n) {
            output.add(new ArrayList<Integer>(nums));
        }

        for(int i=first;i<n;i++){

            Collections.swap(nums,first,i);

            backtrack(n, nums,output,first+1);

            Collections.swap(nums,first,i);
        }

    }
}
