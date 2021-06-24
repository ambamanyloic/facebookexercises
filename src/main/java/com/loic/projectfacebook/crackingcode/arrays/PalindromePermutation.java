package com.loic.projectfacebook.crackingcode.arrays;

public class PalindromePermutation {
    public boolean isPalindrome(String str){

        int start = 0;
        int end = str.length()-1;

        while(start < end){

            if(str.charAt(start) == str.charAt(end)) {
                return true;
            }

            start++;
            end--;
        }

        return false;
    }

    public static void main(String [] args){
        String str1 = "tacocat";
        PalindromePermutation pal = new PalindromePermutation();
        System.out.println(pal.isPalindrome(str1));
    }
}
