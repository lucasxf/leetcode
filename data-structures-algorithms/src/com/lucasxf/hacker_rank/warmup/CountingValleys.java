package com.lucasxf.hacker_rank.warmup;

/**
 * Link: https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * <p>
 * <p>
 * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill,
 * , or a downhill,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:
 * <p>
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
 * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 * <p>
 * Example
 * <p>
 * <p>
 * <p>
 * The hiker first enters a valley  units deep. Then they climb out and up onto a mountain  units high. Finally, the hiker returns to sea level and ends the hike.
 * <p>
 * Function Description
 * <p>
 * Complete the countingValleys function in the editor below.
 * <p>
 * countingValleys has the following parameter(s):
 * <p>
 * int steps: the number of steps on the hike
 * string path: a string describing the path
 * Returns
 * <p>
 * int: the number of valleys traversed
 * Input Format
 * <p>
 * The first line contains an integer , the number of steps in the hike.
 * The second line contains a single string , of  characters that describe the path.
 */
public class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     *
     * SUCCESS (tested and submitted directly at HackerRank)
     */
    public int countingValleys(int steps, String path) {
        // Write your code here
        if (steps < 2 || steps > 10_000_000 || path == null || path.isBlank()) {
            return 0;
        }
        int altitude = 0;
        boolean isSeaLevel;
        int valleys = 0;
        for (char step : path.toCharArray()) {
            isSeaLevel = altitude == 0;
            // downhill
            if ('D' == step) {
                altitude--;
                if (altitude < 0 && isSeaLevel) {
                    valleys++;
                }
            } else { //uphill
                altitude++;
            }
        }
        return valleys;
    }

}

