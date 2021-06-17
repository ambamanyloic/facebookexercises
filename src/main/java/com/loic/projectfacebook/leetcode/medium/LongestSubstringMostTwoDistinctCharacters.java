package com.loic.projectfacebook.leetcode.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringMostTwoDistinctCharacters {

    public int lengthOfLongestSubstringTwoDistinct(String s,int k) {

        int n = s.length();

        if(n < 3) return n;

        int left = 0;
        int right = 0;

        if(n < 3) return n;

        Map<Character,Integer> map = new HashMap<>();

        int max = 2;

        while(right < n) {

            map.put(s.charAt(right),right++);


            if(map.size() == 3) {

                int leftIndex = Collections.min(map.values());

                map.remove(s.charAt(leftIndex));

                left = leftIndex +1;

            }
            max = Math.max(max,right-left);
        }
        return max;

    }

    public static void main(String[] args) {

        String arr = "eceba";
        LongestSubstringMostTwoDistinctCharacters most = new LongestSubstringMostTwoDistinctCharacters();
        System.out.println(most.lengthOfLongestSubstringTwoDistinct(arr,2));

    }


}
