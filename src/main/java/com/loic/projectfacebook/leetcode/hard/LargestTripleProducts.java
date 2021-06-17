package com.loic.projectfacebook.leetcode.hard;

import java.util.*;

public class LargestTripleProducts {

    public List<Integer> findMaxProduct(int[] arr) {
        // Write your code here
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int product = 1;
        List<Integer> list = new ArrayList<>();
        int low = 0;
        int high = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        if(queue.size() < 3){
            list.add(-1);
        } else {
            high=queue.poll();
            low=queue.poll();
            j= queue.poll();

            product = low * high * j;
            list.add(low);
            list.add(high);
            list.add(j);
        }

        return list;
    }
    public static void main(String [] args){
        LargestTripleProducts large = new LargestTripleProducts();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(large.findMaxProduct(array));
    }
}
