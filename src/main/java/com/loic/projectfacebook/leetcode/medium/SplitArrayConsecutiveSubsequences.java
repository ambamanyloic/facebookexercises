package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitArrayConsecutiveSubsequences {

    public boolean isPossible(int [] nums) {


        int count = 0;
        List<Integer> num_list = new ArrayList<Integer>();
        Map<List<Integer>,Integer> mapList = new HashMap<List<Integer>,Integer>();

        for(int i=0;i<nums.length;i++)

        for(int j=i;j< 3;j++){

            if(nums[j+1] > nums[j]) {

                count++;
                num_list.add(nums[j]);


            }

            mapList.put(num_list,count);

        }

        return true;


    }
}
