package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class TopKFrequentWords {


    public List<Integer> topKFrequent(Integer[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        PriorityQueue<Map.Entry<Integer, Integer>> queue =
                new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));

        List<Integer> arr_list = new ArrayList<>();

        for (Integer i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

                for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                    queue.add(entry);
                }
        while (k > 0) {

            Map.Entry<Integer, Integer> entry = queue.poll();
            arr_list.add(entry.getKey());
            k--;
        }

        return arr_list;
    }

    public static void main(String[] args) {


        TopKFrequentWords freq = new TopKFrequentWords();
        //String[] arr = {"i", "love", "leetcode", "i", "love", "coding"};
        Integer[] arr = {1,1,4,5,6,7,8,1,2,3,4,1,4,6,7,9,11,14,15,13,12,1,2,3,4,5,6,7,11,12,13,15,16,17,16,15,14,11,5,6,7,8,2,6,7,9,3,4,5};
        System.out.println(freq.topKFrequent(arr,10));


    }
}
