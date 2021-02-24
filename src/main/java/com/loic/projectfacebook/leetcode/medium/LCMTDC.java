package com.loic.projectfacebook.leetcode.medium;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LCMTDC {

    public Collection<Integer> lengthOfLongestSubstringTwoDistinct(String s) {

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int right = 0;
        int count = 0;

        for(int i=0;i<s.length();i++) {

            if(!map.containsKey(s.charAt(i))) {

                map.put(s.charAt(i),1);
                i++;
            } else {

                map.put(s.charAt(i),map.get(s.charAt(i)) +1);
            }
        }

        return map.values();
    }

    public static void main(String [] args) {


        LCMTDC len = new LCMTDC();
        System.out.println(len.lengthOfLongestSubstringTwoDistinct("eceb"));
    }


}
