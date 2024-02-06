package com.lucasxf.leetcode.binary_search;

import java.util.Arrays;

/**
 * You are given an integer array nums of length n, and an integer array queries of length m.
 * <p>
 * Return an array answer of length m where answer[i] is the maximum size of a subsequence
 * that you can take from nums such that the sum of its elements is less than or equal to queries[i].
 * <p>
 * A subsequence is an array that can be derived from another array by deleting some or no
 * elements without changing the order of the remaining elements.
 */
public class LongestSubsequenceWithLimitedSum {

    public int[] answerQueries(int[] nums, int[] queries) {
        if (nums == null || queries == null) {
            return null;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int m = queries.length;
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int target = queries[i];
            int left = 0;
            int right = n - 1;
            System.out.println("for");
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int num = nums[mid];
                if (num == target) {
                    break;
                }
                if (num > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            int j = 0;
            int sum = 0;
            while (sum < target && j < n) {
                int a = nums[j++];
                sum += a;
                if (sum > target) {
                    --j;
                }
                System.out.println("tar: " + target + " | num: " + a + " | j: " + j + " | sum: " + sum);
            }
            answer[i] = j;
        }
        return answer;
    }

}
