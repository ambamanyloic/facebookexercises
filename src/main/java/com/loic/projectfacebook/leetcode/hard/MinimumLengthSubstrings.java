package com.loic.projectfacebook.leetcode.hard;

import java.util.HashMap;
import java.util.Map;

public class MinimumLengthSubstrings {
    int minLengthSubstring(String s, String t) {
        // Write your code here
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        int s_length = s.length();
        int t_length = t.length();
        int count = 0;

        for(int i=0;i<t_length;i++){
            if(map.containsKey(s.charAt(i))){


            } else {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                count = map.get(s.charAt(i));
            }
        }


        return count;
    }
    public static void main(String [] args){

        MinimumLengthSubstrings min = new MinimumLengthSubstrings();
        String s1 = "dcbefebce";
        String s2 = "fd";
        System.out.println(min.minLengthSubstring(s1,s2));

    }
}
