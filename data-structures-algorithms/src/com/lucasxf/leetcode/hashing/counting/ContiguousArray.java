package com.lucasxf.leetcode.hashing.counting;

/**
 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 * <p>
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
 */
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int left = 0;
        int maxLen = 0;
        int countZeroes = 0;
        int countOnes = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == 0) {
                countZeroes++;
            } else {
                countOnes++;
            }
            if (nums[left] == 0) {
                countZeroes++;
            } else {
                countOnes++;
            }
            while (countZeroes == countOnes && left < right) {
                int currentArrayLen = right - left + 1;
                maxLen = Math.max(maxLen, currentArrayLen);
                left++;
                if (nums[right] == 0) {
                    countZeroes++;
                } else {
                    countOnes++;
                }
                if (nums[left] == 0) {
                    countZeroes++;
                } else {
                    countOnes++;
                }
            }
            while (countZeroes != countOnes && left < right) {
                int currentArrayLen = right - left + 1;
                maxLen = Math.max(maxLen, currentArrayLen);
                right++;
                if (nums[right] == 0) {
                    countZeroes++;
                } else {
                    countOnes++;
                }
                if (nums[left] == 0) {
                    countZeroes++;
                } else {
                    countOnes++;
                }
            }
        }
        return maxLen;
    }
}
