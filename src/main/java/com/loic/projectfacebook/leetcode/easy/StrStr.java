package com.loic.projectfacebook.leetcode.easy;

public class StrStr {

    public int strStr(String haystack, String needle) {

       /* int index = 0;

        index = haystack.indexOf(needle);

        return index;*/

       int L = needle.length();
       int n = haystack.length();

       for(int start=0;start < n - L +1;++start){
           if(haystack.substring(start,start+L).equals(needle)) {
               return start;
           }
       }

        return -1;

    }

    public static void main(String [] args){

    StrStr str = new StrStr();
    String new_str = "hello";

    System.out.println(str.strStr(new_str,"ll"));


    }
}
