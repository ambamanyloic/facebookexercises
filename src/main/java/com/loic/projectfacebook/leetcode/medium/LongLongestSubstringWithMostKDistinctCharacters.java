package com.loic.projectfacebook.leetcode.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongLongestSubstringWithMostKDistinctCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        int max = 0;
        int right = 0;
        int left = 0;
        Map<Character,Integer> map = new HashMap<>();

        while (right < s.length()) {
            map.put(s.charAt(right),right++);

            if(map.size() == k+1) {
                int leftIndex = Collections.min(map.values());
                map.remove(s.charAt(leftIndex));
                left = leftIndex +1;
            }
            max = Math.max(max,right-left);
        }
        return max;
    }

    public static void main(String [] args) {
        LongLongestSubstringWithMostKDistinctCharacters longest = new LongLongestSubstringWithMostKDistinctCharacters();
        String str = "eceba";
        System.out.println(longest.lengthOfLongestSubstringKDistinct(str,2));

    }
}
