package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumberIII {

    public List<Integer> singleNumber(int[] nums) {

        int [] new_array = new int[2];

        Map<Integer,Integer> map= new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i =0;i< nums.length;i++) {

            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        int idx = 0;

        for(Map.Entry<Integer,Integer> h: map.entrySet()){
            if(h.getValue() == 1) {
                new_array[idx++] = h.getKey();
                list.add(h.getKey());
            }
        }

        return list;
    }

    public static void main(String[] args){
        SingleNumberIII number = new SingleNumberIII();
        int[] array = {1,2,1,3,2,5};
        System.out.println(number.singleNumber(array));
    }
}
