package com.loic.projectfacebook.leetcode.easy;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesString {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String str = "";

        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()) {

            char c ;
            c = stack.pop();
            str +=c;
        }
        return str;
    }

    public static void main(String [] args) {

        RemoveAllAdjacentDuplicatesString adjacent = new RemoveAllAdjacentDuplicatesString();
        String str = "abbaca";
        System.out.println(adjacent.removeDuplicates(str));
    }
}
