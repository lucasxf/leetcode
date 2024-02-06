package com.lucasxf.leetcode.arrays_strings;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * <p>
 * Ex. 1:
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * <p>
 * Ex. 2:Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * nums[i] is either 0 or 1.
 * 0 <= k <= nums.length
 */
public class MaxConsecutiveOnes3 {


    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        if (len < 1 || len > 100_000 || k > len) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int zeroes = 0;
        int max = -1;
        int[] window = new int[len];
        int currentWindowOnes = 0;
        int currentWindowZeroes = 0;
        int subArrayLength = 0;
        // [1,1,1,0,0,0,1,1,1,1,0], k = 2
        // [0,1,1,1,1,0,1,1,0,0,0,1,1,1,1], k=3
        while (right < len) {
            if (nums[right] == 0) {
                zeroes++;
            }
            if (zeroes == k) {
                left++;
            }
            subArrayLength = right - left + 1;
            for (int i = left; i < subArrayLength; i++) {
                if (nums[left] == 0) {
                    currentWindowOnes++;
                }
            }
            max = Math.max(max, subArrayLength);
            right++;
        }
        zeroes = 0;

        return max;
    }

}
