package com.loic.projectfacebook.leetcode.medium;

public class MinimumIncrementMakeArrayUnique {

    public int minIncrementForUnique(int[] A) {

        int n = A.length;

        int sum = A[0];
        int prev = A[0];

        for( int i = 1; i < n; i++ ) {
            int curr = A[i];

            if( prev >= curr ) {
                curr = prev+1;
            }
            sum += curr;
            prev = curr;
        }

        return sum;


    }

    public static void main(String [] args) {

        MinimumIncrementMakeArrayUnique uniq = new MinimumIncrementMakeArrayUnique();
        int[] num_array = {3,2,1,2,1,7};

        System.out.println(uniq.minIncrementForUnique(num_array));


    }
}
