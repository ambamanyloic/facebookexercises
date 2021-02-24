package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWAtLeastKRepeatingCharacters {

    public int longestSubstring(String s, int k) {

        int count =0;
        int max = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){

            if(!map.containsKey(s.charAt(i))) {

                map.put(s.charAt(i),1);
            } else {



            }



        }

    return 1;

    }
}
