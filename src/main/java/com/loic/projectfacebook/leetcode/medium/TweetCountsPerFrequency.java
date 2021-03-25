package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class TweetCountsPerFrequency {


    Map<String,List<Integer>> map ;

    public TweetCountsPerFrequency() {
            map = new HashMap<>();
        }

    public void recordTweet(String tweetName, int time) {

        if(map.containsKey(tweetName)) {

            List<Integer> list = map.get(tweetName);

                list.add(time);
                map.put(tweetName, list);

            } else{

            List<Integer> list = new ArrayList<>();
            list.add(time);
            map.put(tweetName, list);

            }

    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {


            if (freq.equals("minute"))
                return getFreq(60,startTime,endTime,tweetName);

            if(freq.equals("hour"))
                return getFreq(3600,startTime,endTime,tweetName);


            if(freq.equals("day"))
                return getFreq(3600 * 24, startTime, endTime, tweetName);

            else

                return null;

    }

       public List<Integer> getFreq(int delta, int startTime, int endTime,String tweetName) {

            int length = (endTime - startTime)/delta +1;

            List<Integer> ans =  new ArrayList<>();

            for (int i=0;i<length;i++)
               ans.add(0);

            List<Integer> timestamps = map.get(tweetName);

                for (int timestamp : timestamps) {

                    if (timestamp >= startTime && timestamp <= endTime) {
                        int index = (timestamp - startTime) / delta;
                        ans.set(index, ans.get(index) + 1);
                    }
            }
        return ans;

    }

    public static void main(String[] args) {

        TweetCountsPerFrequency freq = new TweetCountsPerFrequency();
        freq.recordTweet("tweet3", 10);
        freq.recordTweet("tweet3", 15);
        freq.recordTweet("tweet3", 25);
        freq.recordTweet("tweet3", 40);
        freq.recordTweet("tweet3", 360);
        freq.recordTweet("tweet3", 400);
        //freq.getTweetCountsPerFrequency("hour","tweet1",10,60);
        //freq.getTweetCountsPerFrequency("seconds","tweet1",40,60);
        List<Integer> param_2 = freq.getTweetCountsPerFrequency("minute","tweet3",10,500);
        System.out.println(param_2);


    }
}
