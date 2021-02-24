package com.loic.projectfacebook.leetcode.easy;

public class ValidPalindromeII {

    public boolean validPalindrome(String s) {

            int left = 0;
            int right = s.length()-1;

            while (left < right - 1) {

                if (s.charAt(left) != s.charAt(right)) {
                    if (isValid(s, left, right - 1)) {
                        return true;
                    }
                    if (isValid(s, left + 1, right)) {
                        return true;
                    }
                    return false;

                } else {
                    left ++;
                    right --;
                }
            }
            return true;

        }

        public boolean  isValid(String str,int start,int end){

            while(start < end) {
                if(str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

}
