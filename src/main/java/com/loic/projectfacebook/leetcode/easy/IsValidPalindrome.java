package com.loic.projectfacebook.leetcode.easy;

import java.util.Stack;

public class IsValidPalindrome {

    public boolean isPalindrome(String s) {

        char[] stack_char = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        char leftChar;
        char rightChar;

        while (left <= right) {
            // Update left and right char
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);

            //if (Character.toLowerCase(stack_char[left]) != Character.toLowerCase(stack_char[right])) {
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {

                return false;
            }

            left++;
            right--;
        }

        return true;


    }

    public static void main(String[] args) {

        IsValidPalindrome valid = new IsValidPalindrome();
        System.out.println(valid.isPalindrome("racecar"));
        //System.out.println(valid.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
