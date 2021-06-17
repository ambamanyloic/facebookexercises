package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
    public String customSortString(String S, String T) {

        int s_len = S.length();
        int t_len = T.length();
        int j= 0;

        StringBuilder build = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();

        for(char c: S.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
            build.append(c);
        }

        char[] T_char = T.toCharArray();

        for(char t : T_char){
            if(!map.containsKey(t)) {
                build.append(t);
            }
        }


        return build.toString();

    }
}
