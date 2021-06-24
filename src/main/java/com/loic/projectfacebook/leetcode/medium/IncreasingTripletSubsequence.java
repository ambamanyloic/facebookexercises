package com.loic.projectfacebook.leetcode.medium;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int low = i+1;
            int high = nums.length -1;
            while(i < low && low < high ){
                if(nums[i] > nums[low] && nums[low] > nums[high])
                    return false;
                else
                    low++;
                high--;
            }
        }

        return true;

    }

    public static void main(String [] args){

        IncreasingTripletSubsequence sequence = new IncreasingTripletSubsequence();
        int [] array = {2,1,5,0,4,6};
        System.out.print(sequence.increasingTriplet(array));

    }
}
