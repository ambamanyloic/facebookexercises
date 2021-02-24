package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class TopKFrequentWords {


    public List<Integer> topKFrequent(Integer[] nums, int k) {

        //HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        //PriorityQueue<Map.Entry<String, Integer>> queue =
        PriorityQueue<Map.Entry<Integer, Integer>> queue =
                new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));
        //List<String> arr_list = new ArrayList<>();
        List<Integer> arr_list = new ArrayList<>();

        for (Integer i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

                //for (Map.Entry<String,Integer> entry : map.entrySet()) {
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
        Integer[] arr = {1,1,1,2,2,3};
        System.out.println(freq.topKFrequent(arr,2));


    }
}
