package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class SingleElementSortedArray {

    public int singleNonDuplicate(int[] nums) {

        int ans = -1;
        int n = nums.length;
        for (int i = 0; i < n; i += 2) {
            if (nums[i] != nums[i + 1]) {
                ans = nums[i];
                break;
            }
        }

        return ans;

       /* Map<Integer,Integer> map = new HashMap<>();
        int value = 0;

        for(int i=0;i<nums.length;i++) {

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]+1));
            } else {

                map.put(nums[i],1);
            }

            for (Map.Entry<Integer,Integer> entry : map.entrySet()) {

                while( entry.getValue() != null) {

                    if(entry.getValue() == 1) {

                        value = entry.getKey();
                        break;
                    }
                }
            }

        }

        return value;*/

    }

    public static void main(String [] args) {

        SingleElementSortedArray single = new SingleElementSortedArray();
        int[] single_arr = {3,3,7,7,10,11,11};
        System.out.println(single.singleNonDuplicate(single_arr));


    }
}
