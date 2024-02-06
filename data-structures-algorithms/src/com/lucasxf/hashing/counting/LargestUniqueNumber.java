package com.lucasxf.hashing.counting;

import java.util.*;

/**
 * Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.
 * <p>
 * [8, 2, 8, 3, 8, 9, 9, 5, 7,7,5,6]
 */
public class LargestUniqueNumber {

    public int largestUniqueNumber(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        Map<Integer, Integer> countLargest = new HashMap<>();
        Set<Integer> largests = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int value = countLargest.getOrDefault(n, 0) + 1;
            largests.add(n);
            countLargest.put(n, value);
            if (value == 1) {
                largest = Math.max(largest, n);
            } else {
                largests.remove(n);
            }
        }
        int helper = -1;
        for (int l : largests) {
            helper = Math.max(helper, l);
        }
        return helper;
    }

}
