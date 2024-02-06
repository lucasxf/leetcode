package com.lucasxf.leetcode.binary_search;

public class BinarySearch {

    public int binarySearch(int[] arr, int value) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int n = arr[mid];
            if (n == value) {
                return mid;
            } else if (value > n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
