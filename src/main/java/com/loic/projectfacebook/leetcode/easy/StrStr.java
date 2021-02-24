package com.loic.projectfacebook.leetcode.easy;

public class StrStr {

    public int strStr(String haystack, String needle) {

        int index = 0;

        index = haystack.indexOf(needle);

        return index;

    }

    public static void main(String [] args){

    StrStr str = new StrStr();
    String new_str = "hello";

    System.out.println(str.strStr(new_str,"ll"));


    }
}
