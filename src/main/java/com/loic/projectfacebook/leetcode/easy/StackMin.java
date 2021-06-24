package com.loic.projectfacebook.leetcode.easy;

import java.util.Stack;

public class StackMin {
    Stack<Integer>  stack = new Stack<>();

    public int min() {
        int min = Integer.MAX_VALUE;

        while(!stack.isEmpty()){
            if(stack.pop() < min){
                min = stack.pop();
            }
        }
        return min;
    }
    public int pop(){
        int item = 0;

        while(!stack.isEmpty()){
            item =  stack.pop();
        }

        return -1;
    }
    public void push(Integer item){

        while(!stack.isEmpty()) {
            if(stack.size() > 0){
                stack.push(item);
            }
        }
    }


    public static void main(String[] args){
        StackMin minimum = new StackMin();

        minimum.push(5);
        minimum.push(7);
        minimum.push(3);
        minimum.push(1);

        System.out.println(minimum.min());
    }

}