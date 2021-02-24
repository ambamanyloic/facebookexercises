package com.loic.projectfacebook.leetcode.medium;

public class ReorganizeString {
    public String reorganizeString(String S) {

        char[] new_str = S.toCharArray();
        StringBuffer buff = new StringBuffer();

        for(int i =0;i<S.length()-1;i++){

            if(new_str[i] == new_str[i+1]) {

                buff.append(new_str[i]);
                buff.append(new_str[i+2]);
                buff.append(new_str[i+1]);

                return buff.toString();

            } else {

                     return "";
            }

        }

        return buff.toString();

    }

    public static void main(String [] args) {

        ReorganizeString reorg = new ReorganizeString();
        String str1 = "aaab";
        System.out.println(reorg.reorganizeString(str1));

    }
}
