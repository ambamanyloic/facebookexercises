package com.loic.projectfacebook.leetcode.easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String str = Integer.toString(x);

        int left = 0;
        int right = str.length() -1;

        while (left < right) {

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;

    }

    public static void main(String [] args) {


        PalindromeNumber number = new PalindromeNumber();
        int x = 121;
        System.out.println(number.isPalindrome(x));
    }
}
