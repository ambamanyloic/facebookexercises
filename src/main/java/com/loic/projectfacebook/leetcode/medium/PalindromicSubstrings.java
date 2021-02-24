package com.loic.projectfacebook.leetcode.medium;

public class PalindromicSubstrings {

    public int countSubstrings(String s) {


        /*int count = 0;

        int s_length = s.length();

        char[] s_char = s.toCharArray();

        for(int i=0;i<s.length();i++) {

            for(int j=s.length()-1;j>=0;j--) {


                if (s_char[i] == s_char[j]) {
                    count++;
                }
            }

        }

        return count;*/

        int count = 0;
        for(int i = 0; i < s.length(); ++i){
            count += countPalindromes(s, i, i);
            count += countPalindromes(s, i, i + 1);
        }
        return count;
    }

    // count the number of palindromes with center s[l..r]
    public int countPalindromes(String str, int l, int r){
        int count = 0;
        char [] str_s = str.toCharArray();
        while(l >= 0 && r < str.length() && str_s[l] == str_s[r]){
            ++count;
            --l;
            ++r;
        }
        return count;
    }

    public static void main(String[] args) {

        PalindromicSubstrings pal = new PalindromicSubstrings();
        String str = "aaa";

        System.out.println(pal.countSubstrings(str));


    }
}
