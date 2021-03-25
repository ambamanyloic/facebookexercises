package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaximumNumberOccurrencesSubstring {

    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        int n = s.length();
        int max = 0;
        Map<String,Integer> map = new HashMap<>();

        if (s == null || n == 0 || maxLetters == 0) {
            return 0;
        }

        for(int i=0;i<s.length() -minSize +1;i++) {
            String curr = s.substring(i, i + minSize);
            if (isValid(curr, maxLetters, maxSize)) {
                map.put(curr, map.getOrDefault(curr, 0) + 1);
                max = Math.max(max, map.get(curr));
                }
            }
            return max;
        }

        public boolean isValid(String curr,int maxletters,int maxsize) {


            HashSet<Character> set = new HashSet<>();
            for(char c : curr.toCharArray()) {
                set.add(c);
            }
            return set.size() <= maxletters && curr.length() <= maxsize;
        }

        public static void main(String [] args) {

            MaximumNumberOccurrencesSubstring max = new MaximumNumberOccurrencesSubstring();
            String s = "aababcaab";
            System.out.println(max.maxFreq(s,2,3,4));


        }
}
