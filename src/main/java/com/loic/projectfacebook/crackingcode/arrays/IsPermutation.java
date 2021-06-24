package com.loic.projectfacebook.crackingcode.arrays;

import java.util.Arrays;

public class IsPermutation {
    public boolean ispermutation(String str1,String str2){


        if(sort(str1).toString().equals(sort(str2))) {
            return true;
        }

        return false;

    }

    public String sort(String str){

        char [] str_char = str.toCharArray();
        Arrays.sort(str_char);
        return new String(str_char);
    }

    public static void main(String[] args){

        IsPermutation perm = new IsPermutation();
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(perm.ispermutation(str1,str2));

    }
}
