package com.loic.projectfacebook.leetcode.easy;

public class ReverseInteger {

    public int reverse(int x) {

        String str = Integer.toString(x);
        int left = 0;
        int right = str.length()-1;
        StringBuffer buf = new StringBuffer();



        for(int i=right;i>=0;i--) {

            if(!Character.isLetterOrDigit(str.charAt(0))){

                buf.append(str.charAt(0));
                buf.append(str.charAt(i));
            } else {
                buf.append(str.charAt(i));
            }
        }

        int y = Integer.parseInt(buf.toString());

        return y;
    }

    public static void main(String [] args){

        ReverseInteger reverse = new ReverseInteger();
        int x = -321;
        System.out.println(reverse.reverse(x));
    }
}
