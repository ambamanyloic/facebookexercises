package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringMostTwoDistinctCharacters {

    public int lengthOfLongestSubstringTwoDistinct(String s,int k) {

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int right = 0;
        int left = 0;
        int count = 0;
        int maxLen = 0;

        while (right < s.length()) {

            char right_char = s.charAt(right);

            map.put(right_char, map.getOrDefault(right_char, 0) + 1);

            if (map.get(right_char) == 1) {

                count++;

            }

            right++;

            while(count > k) {

                char left_char = s.charAt(left);
                map.put(left_char,map.get(left_char) -1);

                if(map.get(left_char) == 0) {

                    count--;
                }

                left++;

            }

            maxLen = Math.max(maxLen, right - left);

        }

        return maxLen;

    }

    public static void main(String[] args) {

        String arr = "eceba";
        LongestSubstringMostTwoDistinctCharacters most = new LongestSubstringMostTwoDistinctCharacters();
        System.out.println(most.lengthOfLongestSubstringTwoDistinct(arr,2));

    }


}
