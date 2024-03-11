package com.lucasxf.hacker_rank.arrays;

import java.util.List;

public class NewYearChaos {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */
    public void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribes = 0;
        boolean isChaotic = false;
        System.out.println("Queue: " + q);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int former = q.get(0);
        for (int i = 1; i < q.size(); i++) {
            int person = q.get(i);
            int expectedPosition = person - 1;
            int positionDiff = expectedPosition - i;
            if (person < former) {
                bribes += former - person;
            } else if (positionDiff > 0) {
                bribes += positionDiff;
            }
            if (positionDiff > 2) {
                isChaotic = true;
            }
        }
        for (int i = 0; i < q.size(); i++) {
            int person = q.get(i);
            int expectedPosition = person - 1;
            int positionDiff = expectedPosition - i;
            min = Math.min(min, positionDiff);
            max = Math.max(max, positionDiff);
            int diff = Math.abs(max - min);
            System.out.printf("person: %d | exp pos: %d | act pos: %d | diff: %d | min: %d | max: %d | abs: %d%n",
                    person, expectedPosition, i, positionDiff, min, max, diff);
            if (positionDiff > 0) {
                bribes += positionDiff;
            }
            if (positionDiff > 2) {
                isChaotic = true;
            }
        }
        if (isChaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribes);
        }
    }

}
