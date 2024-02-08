package com.lucasxf.hacker_rank.warmup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FAIL
 */
public class JumpingOnTheClouds {


    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */
    public int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        if (c == null || c.isEmpty()) {
            return 0;
        }
        int steps = c.size();
        int zeroCount = 0;
        int s = c.size();
        for (int cloud : c) {
            if (cloud == 0) {
                zeroCount++;
                if (s == 1) {
                    steps--;
                }
            } else {
                zeroCount = 0;
                steps--;
            }
            if (zeroCount > 0 && zeroCount %3 == 0) {
                steps--;
                System.out.println("k");
            }
            s--;
        }
        return steps;
    }


}
