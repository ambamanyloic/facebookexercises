package com.loic.projectfacebook.leetcode.easy;

import java.util.ArrayList;

public class MergedSortArray {

    public static void merge(int[] nums1, int[] nums2, int n,int m ,int[] nums3) {

        ArrayList<Integer> new_list = new ArrayList<Integer>();
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i<m && j <n) {

            if (nums1[i] < nums2[j]) {

                nums3[k++] = nums1[i++];
                new_list.add(nums1[i++]);
            } else {

                nums3[k++] = nums2[j++];
                new_list.add(nums2[j++]);
            }

            while (i < m)
                nums3[k++] = nums1[i++];
                new_list.add(nums1[i++]);

            // Store remaining elements of second array
            while (j < n)
                nums3[k++] = nums2[j++];
                new_list.add(nums2[j++]);
        }


    }

    public static void main(String[] args){

        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;

        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];

        merge(arr1, arr2, n1, n2, arr3);

        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }


}
