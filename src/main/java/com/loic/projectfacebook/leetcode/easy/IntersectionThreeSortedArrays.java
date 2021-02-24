package com.loic.projectfacebook.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionThreeSortedArrays {

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {

        ArrayList<Integer> arr_list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);


        while(i <  arr1.length && j < arr2.length && k < arr3.length){

            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {

                arr_list.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]){
                i++;
            } else if (arr2[j] < arr3[k]){
                j++;
            } else {

                k++;
            }

        }


        List<Integer> result = new ArrayList<>();
        for(int m: arr_list){

            result.add(m);
        }

        return result;

    }

    public static void main(String[] args) {

        IntersectionThreeSortedArrays three = new IntersectionThreeSortedArrays();
        int[] num1 = {4,9,5,1};
        int[] num2 = {9,4,9,8,4,1};
        int[] num3 = {4,5,15,1,6};

        System.out.println(three.arraysIntersection(num1,num2,num3));
    }
}
