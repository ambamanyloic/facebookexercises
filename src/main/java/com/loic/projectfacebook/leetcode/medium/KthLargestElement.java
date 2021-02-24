package com.loic.projectfacebook.leetcode.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        PriorityQueue<Integer> queue = new PriorityQueue(k);

        for(int i: nums){
            queue.offer(i);

            if(queue.size()>k){
                queue.poll();
            }
        }

        return queue.peek();

        /*int value = 0;
        int size = nums.length-1;
        return nums[nums.length-k];*/

    }

    public static void main(String[] args){

        KthLargestElement element = new KthLargestElement();
        int[] arr = {3,2,1,5,6,4};
        System.out.println(element.findKthLargest(arr,2));
    }
}
