package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    List<List<Integer>> output = new ArrayList<>();

        this.backtrack(target,list,0,candidates,output);
        return output;
}

    public void backtrack(int remain,
                          LinkedList<Integer> list,
                          int start, int[] candidates,
                          List<List<Integer>> results){

        if (remain == 0) {
            // make a deep copy of the current combination
            results.add(new ArrayList<Integer>(list));
            return;
        } else if (remain < 0) {
            // exceed the scope, stop exploration.
            return;
        }

        for(int i=start;i<candidates.length;++i) {
            list.add(candidates[i]);
            this.backtrack(remain - candidates[i], list, i, candidates, results);
            list.removeLast();
        }


    }

    public static void main(String [] args) {

        CombinationSum sum = new CombinationSum();
        int[] arr = {2,3,6,7};
        System.out.println(sum.combinationSum(arr,7));
    }
}
