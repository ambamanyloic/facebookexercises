package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestStringWRepeating {

    public int lengthOfLongestSubstring(String s) {

        int maxCount = 0;
        int right = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        while(right < s.length()) {

            if(!set.contains(s.charAt(right))) {

                set.add(s.charAt(right));
                right++;
                maxCount = Math.max(maxCount,set.size());

            } else {

                set.remove(s.charAt(left));
                left++;
            }

        }

        return maxCount;
    }

    public static void main(String [] args) {

        LongestStringWRepeating str = new LongestStringWRepeating();
        String s = "abcabcbb";
        System.out.println(str.lengthOfLongestSubstring(s));

    }
}
