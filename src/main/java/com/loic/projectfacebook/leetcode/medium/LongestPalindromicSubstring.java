package com.loic.projectfacebook.leetcode.medium;

public class LongestPalindromicSubstring {

    public String findPalindrome(String s,int left, int right) {

        if(s.isEmpty()) {
            return "";
        }


        int len = s.length();

        // expand in both directions
        while (left >= 0 && right < len &&
                (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }



    public  String longestPalindromicSubString(String str,int len)
    {

        // max_str stores the maximum length palindromic substring
        // found so far

        String max_str = "", curr_str;

        // max_length stores the length of maximum length palindromic
        // substring found so far

        int max_length = 0, curr_length;

        // consider every adjacent pair of characters as mid points and
        // expand in both directions to find maximum length palindrome

        for (int i = 0; i < len; i++)
        {
            // find a longest odd length palindrome with str[i] as mid point

            curr_str = findPalindrome(str, i, i);
            curr_length = curr_str.length();


            // update maximum length palindromic substring if odd length
            // palindrome has greater length

            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }

            // find a longest even length palindrome with str[i] and
            // str[i+1] as mid points.
            // Note that an even length palindrome has two mid points

            curr_str = findPalindrome(str, i, i + 1);
            curr_length = curr_str.length();

            // update maximum length palindromic substring if even length
            // palindrome has greater length

            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
        }

        return max_str;

    }

    public static void main(String[]args){

        LongestPalindromicSubstring longest = new LongestPalindromicSubstring();
        String str = "babad";
        System.out.println(longest.longestPalindromicSubString(str,str.length()-1));
    }
}
