package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {

        List<String> combinations = new ArrayList<>();

        generateParenthesis(new char[2 * n], 0, combinations);

        return combinations;

    }


public void generateParenthesis(char[] current,int pos ,List<String> combinations){
        List<String> list = new ArrayList<>();


        if(pos == current.length) {

            if (validChar(current)) {
                list.add(new String(current));

            } else {
                current[pos] = '(';
                generateParenthesis(current,pos+1,combinations);
                current[pos] = ')';
                generateParenthesis(current,pos+1,combinations);
            }
        }


    }

    public boolean validChar(char[] current){

        int balance = 0;

        for(char c : current){

            if( c == '(')
                balance++;

            else balance--;

            if(balance < 0)
                return false;

        }

        return (balance == 0);
    }
}
