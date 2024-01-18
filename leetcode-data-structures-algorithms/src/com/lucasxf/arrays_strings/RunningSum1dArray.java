package com.lucasxf.arrays_strings;

public class RunningSum1dArray {

    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if (len < 2 || len > 1000) {
            return null;
        }
        int[] sums = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        return sums;
    }

}
