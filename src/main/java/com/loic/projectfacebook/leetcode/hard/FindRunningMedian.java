package com.loic.projectfacebook.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRunningMedian {
    public double findMedian(int[] array){
        if(array == null) {
            return 0.0;
        }
        Arrays.sort(array);
        int len = array.length;
        double median = 0.0;
        List<Integer> theList = new ArrayList<>();
        int low = 0;
        int high = len;

        while(low < high) {
            int middle = (low + high) / 2;

            for (int i : theList) {

                if (i >= theList.get(middle)) {
                    low = middle + 1;
                    if (middle + 1 < theList.size() && i <= theList.get(middle + 1)) {
                        high = middle + 1;
                    }
                } else {
                    high = middle;
                    if (middle > 0 && i >= theList.get(middle - 1)) {
                        low = middle;
                    }
                }

                theList.add(low, i);

            }
        }
        return median;

    }

    public static void main(String[] args){
        FindRunningMedian running = new FindRunningMedian();
        int[] array = new int[]{1,2,3,4};
        System.out.println(running.findMedian(array));
    }
}
