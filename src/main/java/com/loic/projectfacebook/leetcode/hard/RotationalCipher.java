package com.loic.projectfacebook.leetcode.hard;

public class RotationalCipher {
    public String rotationalCipher(String input, int rotationFactor) {
        int left = 0;
        int right = input.length()-1;
        while(left < right){
            input = input.substring(rotationFactor) + input.substring(left,rotationFactor);
            left++;
        }
        return input;

    }

    public static void main(String [] args){
        RotationalCipher cipher = new RotationalCipher();
        String str = "adefk";
        System.out.print(cipher.rotationalCipher(str,2));
    }

}
