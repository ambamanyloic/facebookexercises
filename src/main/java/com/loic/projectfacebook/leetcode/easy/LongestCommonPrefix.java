package com.loic.projectfacebook.leetcode.easy;

import java.util.*;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String [] strs) {
        /*
        int size = strings.length;
        Arrays.sort(strings);
        int length = strings[0].length();
        StringBuilder res = new StringBuilder();
        // Comapre the first and the last strings character
        // by character.
        for (int i = 0; i < length; i++) {
            // If the characters match, append the character to the result.
            if (strings[0].charAt(i) == strings[size - 1].charAt(i)) {
                res.append(strings[0].charAt(i));
            }
            // Else, stop the comparison.
            else {
                break;
            }
        }
        String result = res.toString();

        return result;
        */

        if(strs == null || strs.length == 0)
            return "";
        return longestCommonPrefix(strs,0,strs.length-1);
    }

    public String longestCommonPrefix(String[] strs,int left,int right){

        if(left == right)
            return strs[left];

        int mid = (left + right) /2;

        String lcpLeft = longestCommonPrefix(strs,left,mid);
        String lcpRight = longestCommonPrefix(strs,mid+1,right);

        return CommonPrefix(lcpLeft,lcpRight);

    }

    String CommonPrefix(String left,String right){

        int min = Math.min(left.length(),right.length());

        for(int i=0;i<min;i++){
            if(left.charAt(i) != right.charAt(i))
                return left.substring(0,i);
        }

        return left.substring(0,min);
    }

    public static void main(String [] args){

        LongestCommonPrefix pre = new LongestCommonPrefix();
        String [] r = {"flopper","flower","flight"};
        System.out.println(pre.longestCommonPrefix(r));

    }
}
