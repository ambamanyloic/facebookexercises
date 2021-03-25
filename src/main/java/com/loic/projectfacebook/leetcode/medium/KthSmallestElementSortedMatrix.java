package com.loic.projectfacebook.leetcode.medium;

public class KthSmallestElementSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {

        int value = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)

                value =  matrix[i][j];
        return value;
    }
}
