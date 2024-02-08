package com.lucasxf.hacker_rank.warmup;

/**
 * Success at 08/02/2024 11h42 BRT
 */
public class RepeatedString {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public long repeatedString(String s, long n) {
        // Write your code here
        if (s == null || s.isBlank() || n < 1 || n > (long) Math.pow(10, 12)) {
            return 0;
        }
        int length = s.length();
        long asPerRepeat = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                asPerRepeat++;
            }
        }
        if (n % length == 0) {
            return asPerRepeat * (n / length);
        }
        long mod = n % length;
        long fittingSize = n - mod;
        long countAs = (fittingSize / length) * asPerRepeat;
        String substr = s.substring(0, (int) mod);
        for (char c : substr.toCharArray()) {
            if (c == 'a') {
                countAs++;
            }
        }
        return countAs;
    }
}
