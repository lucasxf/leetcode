package com.lucasxf.hacker_rank.arrays;

import java.util.List;

/**
 * Success at 09/02/2024 - 10h09
 */
public class HourglassSum {


    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        if (arr == null || arr.isEmpty()) {
            return 0;
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            List<Integer> topRow = arr.get(i);
            List<Integer> midRow = arr.get(i + 1);
            List<Integer> botRow = arr.get(i + 2);
            for (int j = 0; j < topRow.size() - 2; j++) {
                int top = 0;
                int bot = 0;
                int mid = midRow.get(j + 1);
                for (int k = j; k < j + 3; k++) {
                    top += topRow.get(k);
                    bot += botRow.get(k);
                }
                int currSum = top + mid + bot;
                result = Math.max(result, currSum);
            }
        }
        return result;
    }

}
