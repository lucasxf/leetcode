package com.lucasxf.arrays_strings.bonus.sliding_window;

/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * <p>
 * Example 1:
 * <p>
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 * <p>
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 * <p>
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */
public class MinSizeSubarraySum {

    // [2,3,1,2,4,3] - 7
    // [0,1,2,3,4,5]
    public int minSubArrayLen(int target, int[] nums) {
        if (target < 1 || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                int subArrayLen = right - left + 1;
                result = Math.min(result, subArrayLen);
                sum -= nums[left];
                left++;
            }
        }
        if (left == 0) {
            return 0;
        }
        return result;
    }

}
