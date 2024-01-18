package com.lucasxf.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstrWoutRepeatChars {

    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int maxLen = 0;
        int left = 0;
        System.out.println("Input: " + s);
        StringBuilder aux = new StringBuilder().append(s.charAt(left));
        String currStr = "";
        for (int right = 1; right < s.length(); right++) {
            System.out.println("Right: " + s.charAt(right));
            System.out.println("Out Aux: " + aux);
            if (aux.toString().contains("" + s.charAt(right))) {
                // currStr = aux
            }
            while (aux.toString().contains("" + s.charAt(right)) && left < aux.length()) {
                int currentStringLen = right - left + 1;
                maxLen = Math.max(maxLen, currentStringLen);
                aux.deleteCharAt(left++);
                System.out.println("In Auxx: " + aux);
            }
            aux.append(s.charAt(right));
        }
        return maxLen;
    }

}
