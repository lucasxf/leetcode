package com.lucasxf.leetcode.hashing.counting;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * <p>
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 */
public class MaxNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        if (text == null || text.isBlank() || text.length() > 10_000) {
            return 0;
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int aCount = charCount.getOrDefault('a', -1);
        if (aCount < 1) {
            return 0;
        }
        int bCount = charCount.getOrDefault('b', -1);
        if (bCount < 1) {
            return 0;
        }
        int lCount = charCount.getOrDefault('l', -1);
        if (lCount < 2) {
            return 0;
        }
        int oCount = charCount.getOrDefault('o', -1);
        if (oCount < 2) {
            return 0;
        }
        int nCount = charCount.getOrDefault('n', -1);
        if (nCount < 1) {
            return 0;
        }
        int result = Math.min(aCount, bCount);
        result = Math.min(result, nCount);
        result = Math.min(result, lCount / 2);
        return Math.min(result, oCount / 2);
    }

}
