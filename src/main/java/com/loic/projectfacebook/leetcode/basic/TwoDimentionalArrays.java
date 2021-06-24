package com.loic.projectfacebook.leetcode.basic;

public class TwoDimentionalArrays {

    public static void main(String [] args){

        String[][] arrStr = new String[3][4];
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrStr[i][j] = "Str " + j;
                System.out.print(arrStr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
