package com.loic.projectfacebook.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int max = 0;

        while(right < s.length()) {

            if(!set.contains(s.charAt(right))) {

                set.add(s.charAt(right));
                right++;
                max = Integer.max(max,set.size());
            } else {


                set.remove(s.charAt(left));
                left++;

            }
        }

        return max;


}

    public static void main(String [] args) {

        LongestSubstringWithoutRepeatingCharacters str = new LongestSubstringWithoutRepeatingCharacters();
        String s = "pwwkew";
        System.out.println(str.lengthOfLongestSubstring(s));

    }


}
