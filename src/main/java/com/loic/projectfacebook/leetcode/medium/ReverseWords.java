package com.loic.projectfacebook.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
   public String reverseWords(String s) {


       /*String words[] = s.split("\\s");
       StringBuilder reverse = new StringBuilder();

       for (int i = words.length-1;i>=0;i--) {

           reverse.append(words[i]).append(' ');
       }

       return reverse.toString().trim();*/

       s = s.trim();
       // split by multiple spaces
       List<String> wordList = Arrays.asList(s.split("\\s+"));
       Collections.reverse(wordList);
       return String.join(" ", wordList);


    }

    public static void main(String[] args){

       ReverseWords reverse = new ReverseWords();
       String str1 = "the sky is blue";

       System.out.println(reverse.reverseWords(str1));

    }
}
