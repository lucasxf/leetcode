package com.lucasxf.leetcode.hashing.checking_for_existence;

import java.util.*;

/**
 * Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr. If there are duplicates in arr, count them separately.
 * <p>
 * Input: arr = [1,2,3]
 * Output: 2
 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
 * <p>
 * Input: arr = [1,1,3,3,5,5,7,7]
 * Output: 0
 * Explanation: No numbers are counted, cause there is no 2, 4, 6, or 8 in arr.
 */
public class CountingElements {

    public int countElements(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        }
        final Set<Integer> aux = new HashSet<>();
        for (int j : arr) {
            aux.add(j);
        }
        int result = 0;
        for (int j : arr) {
            int sum = j + 1;
            if (aux.contains(sum)) {
                result++;
            }
        }
        return result;
    }

}
