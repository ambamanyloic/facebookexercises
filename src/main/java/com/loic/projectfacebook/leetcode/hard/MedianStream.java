package com.loic.projectfacebook.leetcode.hard;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianStream {
    int[] findMedian(int[] arr) {

        if (arr == null || arr.length == 0) return null;

        Queue<Integer> q = new PriorityQueue<>();

        int[] output = new int[arr.length];
        for (int i = 0;i < arr.length; i++) {

            q.offer(arr[i]);

            int len = q.size();
            int mid = -1;


            int[] temp = new int[len];
            for (int j = 0; j < len; j++) {
                temp[j] = q.poll();
            }


            if (len % 2 == 0) {
                mid = len / 2 - 1;
                output[i] = (temp[mid] + temp[mid + 1]) / 2;
            } else {
                mid = len / 2;
                output[i] = temp[mid];
            }

            for (int j = 0; j < len; j++) {
                q.offer(temp[j]);
            }

        }

        return output;

    }
}
