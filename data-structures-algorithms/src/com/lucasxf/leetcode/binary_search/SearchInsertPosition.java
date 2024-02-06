package com.lucasxf.leetcode.binary_search;

/**
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {


    // SUCCESS
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int num = nums[middle];
            if (num == target) {
                return middle;
            }
            if (num > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

}
