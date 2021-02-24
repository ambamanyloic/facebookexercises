package com.loic.projectfacebook.leetcode.medium;

public class PermutationStrings {

    public boolean checkInclusion(String s1, String s2) {

        int i =0;
        int j = 1;
        i++;
        j--;



        if(!s2.contains(s1.charAt(j) + "" + s1.charAt(i))) {
            return false;
        }

        return true;

    }

    public static void main(String[] args) {

        PermutationStrings perm = new PermutationStrings();
        System.out.println(perm.checkInclusion("ab","eidbaooo"));


    }
}
