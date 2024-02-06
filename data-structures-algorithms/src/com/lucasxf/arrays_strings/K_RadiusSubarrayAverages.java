package com.lucasxf.arrays_strings;

import java.util.Arrays;

public class K_RadiusSubarrayAverages {
    // 1 2 3 4
    // 1 3 6 10
    public int[] getAverages(int[] nums, int k) {
        final int[] result = new int[nums.length];
        final long[] prefix = new long[nums.length + 1];
        long sum = 0;
        if (k == 0) {
            return nums;
        }
        for (int i = 1; i <= nums.length; i++) {
            sum += nums[i - 1];
            prefix[i] = sum;
        }
        System.out.println("Prefix: " + Arrays.toString(prefix));
        for (int i = 0; i < nums.length; i++) {
            if (i < k || i + k >= nums.length) {
                result[i] = -1;
            } else {
                int r = (int) (prefix[i + k + 1] - prefix[i - k]) / (k * 2 + 1);
                System.out.printf("result[%d] = %d-%d / %d = %d%n", i, prefix[i + k + 1], prefix[i - k], (i + k), r);
                result[i] = r;
            }
        }
        return result;
    }
}
/**
 * Prefix: [40527, 94223, 104953, 171444, 233585, 317494, 396129, 414689]
 * resultX[2] = 233585 / 5 = 46717
 * result[3] = 317494-40527 / 5 = 55393
 * result[4] = 396129-94223 / 6 = 60381
 * result[5] = 414689-104953 / 7 = 61947
 * Result: [-1, -1, 46717, 55393, 60381, 61947, -1, -1]
 */