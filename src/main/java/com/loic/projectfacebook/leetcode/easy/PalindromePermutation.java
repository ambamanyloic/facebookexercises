package com.loic.projectfacebook.leetcode.easy;

import java.util.HashMap;

public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {

        HashMap< Character, Integer > map = new HashMap < > ();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (char key: map.keySet()) {
            count += map.get(key) % 2;
        }

        if(count <=1) { return true; }

        return false;
    }

    public static void main(String[] args) {

        PalindromePermutation permutation = new PalindromePermutation();
        String str = "carerac";
        System.out.println(permutation.canPermutePalindrome(str));
    }
}
