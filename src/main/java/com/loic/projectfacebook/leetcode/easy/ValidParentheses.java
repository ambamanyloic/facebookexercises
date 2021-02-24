package com.loic.projectfacebook.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        char[] string_char = s.toCharArray();
        Stack<Character> stck_chr = new Stack<>();
        HashMap<Character, Character> hMap = new HashMap<Character, Character>();
        hMap.put('(', ')');
        hMap.put('[', ']');
        hMap.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            char token = s.charAt(i);
            if (hMap.keySet().contains(token)) {
                stck_chr.push(token);
            } else if(hMap.values().contains(token)) {
                if (!stck_chr.empty() && hMap.get(stck_chr.peek()) == token)
                    stck_chr.pop();
                else
                    return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        String str = "[{[}]";
        ValidParentheses valid = new ValidParentheses();
        System.out.println(valid.isValid(str));
    }
}
