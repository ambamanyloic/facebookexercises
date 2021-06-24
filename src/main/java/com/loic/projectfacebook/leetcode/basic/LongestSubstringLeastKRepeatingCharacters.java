package com.loic.projectfacebook.leetcode.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class LongestSubstringLeastKRepeatingCharacters {

    public List<Integer> longestSubstring(String s, int k) {

        Map<Character,Integer> map = new HashMap<>();
        char[] s_char = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int value = 0;

        for(char c : s_char) {

            if(map.containsKey(c)) {

                map.put(c,map.get(c) + 1);
            } else {

                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> hm : map.entrySet()) {

            if(hm.getValue() >= k) {

                value = hm.getValue();
                list.add(value);
            }
        }

        return list;

    }

    public static void main(String args []) {

        LongestSubstringLeastKRepeatingCharacters longest = new LongestSubstringLeastKRepeatingCharacters();

        System.out.println(longest.longestSubstring("aaabb",2));

    }
}
