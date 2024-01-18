package com.lucasxf.arrays_strings;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 * <p>
 * Ex. 1
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * <p>
 * Ex. 2
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */
public class MaxAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {
        if (k < 1 || k > 100_000) {
            return 0;
        }
        int n = nums.length;
        double sum = 0;
        int left = 0;
        double average = Double.NEGATIVE_INFINITY;
        double result = Double.NEGATIVE_INFINITY;
        System.out.println(" result " + result);
        for (int right = 0; right < n; right++) {
            int subarrayLength = right - left + 1;
            sum += nums[right];
            System.out.println("sub len: " + subarrayLength);
            System.out.println("old sum: " + sum);
            if (subarrayLength == k) {
                average = sum / k;
                sum -= nums[left];
                System.out.println("new sum: " + sum);
                System.out.println("cur avg: " + average);
                left++;
            }
            result = Math.max(average, result);
            System.out.println("max avg: " + result);
        }
        return result;
    }
}
