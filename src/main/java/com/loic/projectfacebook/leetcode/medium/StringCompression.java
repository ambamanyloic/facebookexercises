package com.loic.projectfacebook.leetcode.medium;

public class StringCompression {
    public int compress(char[] chars) {

        int index = 0;
        int indexResult = 0;
        int size = chars.length;

        while(index < size){
            char curr = chars[index];
            int count =1;

            while(index +1 < size && chars[index+1] == curr){
                count++;
                index++;

                chars[indexResult++] = curr;
                index++;

                if(count ==1) continue;

                for(char c : String.valueOf(count).toCharArray()){
                    chars[indexResult++] = c;
                }
            }
        }

        return indexResult;

    }

    public static void main(String [] args){

        StringCompression compression =  new StringCompression();
        char[] new_char = {'a','a','b','b','c','c','c'};

        System.out.println(compression.compress(new_char));

    }
}
