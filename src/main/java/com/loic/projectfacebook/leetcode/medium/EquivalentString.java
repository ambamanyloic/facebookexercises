package com.loic.projectfacebook.leetcode.medium;

public class EquivalentString {
    public String equivalentString(int num){

        String str = String.valueOf(num);

        return str;
    }

    public static void main(String[] args) {


        EquivalentString equival = new EquivalentString();
        int n = 12;
        System.out.println(equival.equivalentString(n));
    }
}
