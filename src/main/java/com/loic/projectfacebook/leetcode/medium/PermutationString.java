package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {

        /*s1 = sort(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (s1.equals(sort(s2.substring(i, i + s1.length()))))
                return true;
        }
        return false;
    }
    public String sort(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);*/

        if(s1.length() > s2.length()){
            return false;
        }
        HashMap<Character,Integer> s1map = new HashMap<Character,Integer>();
        for(int i=0;i<s1.length();i++)
            s1map.put(s1.charAt(i),s1map.getOrDefault(s1.charAt(i),0)+1);
        for(int i=0;i<= s2.length() - s1.length();i++){
            HashMap<Character,Integer> s2map = new HashMap<>();
            for(int j=0;j<s1.length();j++){
                s2map.put(s2.charAt(i+j),s2map.getOrDefault(s2.charAt(i+j),0)+1);
            }
            if(matches(s1map,s2map))
                return true;
        }
        return false;
    }

    public boolean matches(HashMap < Character, Integer > s1map, HashMap < Character, Integer > s2map) {
        for (char key: s1map.keySet()) {
            if (s1map.get(key) - s2map.getOrDefault(key, -1) != 0)
                return false;
        }
        return true;
    }

}
