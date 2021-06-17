package com.loic.projectfacebook.leetcode.medium;

import java.util.Arrays;

public class MinimumIncrementMakeArrayUnique {

    public int minIncrementForUnique(int[] A) {

        int count = 0;
        Arrays.sort(A);

        for(int i =1;i<A.length;++i) {

            if(A[i] <= A[i-1]) {

                int temp = A[i];
                A[i] = A[i - 1] + 1;

                count += A[i] - temp;

            }

        }

        return count;


    }

    public static void main(String [] args) {

        MinimumIncrementMakeArrayUnique uniq = new MinimumIncrementMakeArrayUnique();
        int[] num_array = {3,2,1,2,1,7};

        System.out.println(uniq.minIncrementForUnique(num_array));


    }
}
