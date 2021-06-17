package com.loic.projectfacebook.leetcode.medium;

import java.util.*;
import java.util.PriorityQueue;

public class TopTenTweets {

    public List<Integer> topTen(String[] tweetNames, int time,int k) {

        //PriorityQueue<Map.Entry<String, Integer>> queue =
        //int k = 10;
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> queue =
                new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));

        for (String tweetName : tweetNames) {

            if(!map.containsKey(tweetName)) {

                map.put(tweetName, map.getOrDefault(tweetName, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            queue.add(entry);
        }

        while (k > 0) {

            Map.Entry<String, Integer> entry = queue.poll();
            list.add(entry.getValue());
            k--;

        }

        return list;

    }

    public static void main(String[] args){

        String[] tweets = {"aaa","bbb","aaa","ccc","aaa","bbb"};
        TopTenTweets top = new TopTenTweets();
        System.out.println(top.topTen(tweets,10,5));
    }
}
