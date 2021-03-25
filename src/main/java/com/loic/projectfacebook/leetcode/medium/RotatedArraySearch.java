package com.loic.projectfacebook.leetcode.medium;

public class RotatedArraySearch {
    public boolean binarySearch(int arr[], int low, int high, int key){
        if(high < low)
            return false;
        int mid = (high + low) /2;
        if(arr[mid] == key)
            return true;
        if(arr[low] <= arr[mid]){
            if(key >= arr[low] && arr[mid] >= key)
                return binarySearch(arr, low, mid - 1, key);
            return binarySearch(arr, mid + 1, high, key);
        }
        if(arr[mid] <= key && high >= key)
            return binarySearch(arr, mid + 1, high, key);
        return binarySearch(arr, low, mid - 1, key);
    }
}
