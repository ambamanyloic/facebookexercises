package com.loic.projectfacebook.crackingcode.arrays;

public class OneAway {
    public boolean oneTwoEditsAway(String str1, String str2){

        int start = 0;
        int end = 0;

        while(start < str1.length() && end < str2.length()) {

            if (str1.charAt(start) == (str2.charAt(end))) {
                return true;
            }
            start++;
            end++;
        }

        return false;

    }

    public static void main(String [] args){
        String str1 = "pale";
        String str2 = "ple";
        OneAway away = new OneAway();
        System.out.println(away.oneTwoEditsAway(str1,str2));
    }
}
