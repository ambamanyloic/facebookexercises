package com.loic.projectfacebook.crackingcode.arrays;

public class IsUnique {
    public boolean isUnique(String str) {

        if (str.length() > 128) return false;

        char[] str_char = str.toCharArray();
        int [] val_char =  new int[26];
        StringBuilder build= new StringBuilder();
        for(char c : str_char) {

            //val_char
        }

        return true;

    }

    public static void main(String[] args){

        String str = "abcd";
        IsUnique uniq = new IsUnique();
        System.out.println(uniq.isUnique(str));
    }
}
