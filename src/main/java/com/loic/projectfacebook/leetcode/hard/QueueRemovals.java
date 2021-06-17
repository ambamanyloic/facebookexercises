package com.loic.projectfacebook.leetcode.hard;

import java.util.*;

public class QueueRemovals {
    List<Integer> findPositions(int[] arr, int x) {


        List<Integer> new_list = new ArrayList<>();
        int index = 0;
        int max = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            } else {

            }
        }

        new_list.add(max);

        return new_list;

    }

    public static void main(String[] args){
        QueueRemovals queue = new QueueRemovals();
        int[] array = {1, 2, 2, 3, 4, 5};
        System.out.println(queue.findPositions(array,6));
    }
}
