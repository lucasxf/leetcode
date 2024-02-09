package com.lucasxf.hacker_rank.arrays;

import java.util.List;

/**
 * Success at 09/02/2024 - 10h24
 */
public class LeftRotation {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        for (int i = 0; i < d; i++) {
            int start = a.remove(0);
            a.add(start);
        }
        return a;
    }

}
