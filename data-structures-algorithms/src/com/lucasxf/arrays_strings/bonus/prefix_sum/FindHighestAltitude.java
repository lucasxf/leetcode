package com.lucasxf.arrays_strings.bonus.prefix_sum;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 * <p>
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 */
public class FindHighestAltitude {

    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int[] prefix = new int[len + 1];
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            prefix[i + 1] = prefix[i] + gain[i];
            result = Math.max(result, prefix[i]);
        }
        return Math.max(result, prefix[len]);
    }

}
