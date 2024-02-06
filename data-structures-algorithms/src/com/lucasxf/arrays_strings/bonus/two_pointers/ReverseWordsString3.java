package com.lucasxf.arrays_strings.bonus.two_pointers;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 * <p>
 * Input: s = "Mr Ding"
 * Output: "rM gniD"
 */
public class ReverseWordsString3 {
    public String reverseWords(String s) {
        if (s == null || s.isBlank()) {
            return s;
        }
        final String[] words = s.split(" ");
        final StringBuilder result = new StringBuilder();
        for (String word : words) {
            char[] current = word.toCharArray();
            int i = 0;
            int j = current.length - 1;
            while (i < j) {
                char left = current[i];
                char right = current[j];
                current[i] = right;
                current[j] = left;
                i++;
                j--;
            }
            result.append(current).append(" ");
        }
        return result.toString().trim();
    }
}
