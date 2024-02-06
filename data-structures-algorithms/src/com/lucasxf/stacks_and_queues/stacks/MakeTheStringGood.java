package com.lucasxf.stacks_and_queues.stacks;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s of lower and upper case English letters.
 * <p>
 * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
 * <p>
 * 0 <= i <= s.length - 2
 * s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
 * To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
 * <p>
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 * <p>
 * Notice that an empty string is also good.
 * <p>
 * Input: s = "leEeetcode"
 * Output: "leetcode"
 * Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
 * <p>
 * Input: s = "abBAcC"
 * Output: ""
 * Explanation: We have many possible scenarios, and all lead to the same answer. For example:
 * "abBAcC" --> "aAcC" --> "cC" --> ""
 * "abBAcC" --> "abBA" --> "aA" --> ""
 * <p>
 * Input: s = "s"
 * Output: "s"/
 * <p>
 */
public class MakeTheStringGood {

    private boolean isValidPair(char c1, char c2) {
        if (Character.toUpperCase(c1) == Character.toUpperCase(c2)) {
            return !(Character.isLowerCase(c1) && Character.isUpperCase(c2) ||
                    Character.isLowerCase(c2) && Character.isUpperCase(c1));
        }
        return Character.isAlphabetic(c1) && Character.isAlphabetic(c2);
    }

    private boolean isBadPair(char c1, char c2) {
        return !isValidPair(c1, c2);
    }

    public String makeGood(String s) {
        System.out.println("Input: " + s);
        if (s == null || s.isBlank()) {
            return "";
        }
        if (s.trim().length() == 1) {
            return s;
        }
        final StringBuilder result = new StringBuilder(s);
        int i = 0;
        while (i < result.length() - 1) {
            char curr = result.charAt(i);
            char next = result.charAt(i + 1);
            if (isValidPair(curr, next)) {
                i++;
            }
            if (isBadPair(curr, next)) {
                i = 0;
            }
            while (isBadPair(curr, next)) {
                result.deleteCharAt(i);
                result.deleteCharAt(i - 1);
            }
        }
        return result.toString();
    }


}
