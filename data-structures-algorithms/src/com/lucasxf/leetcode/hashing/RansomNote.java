package com.lucasxf.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 * <p>
 * <p>
 * Accepted!
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.isBlank()) {
            return false;
        }
        if (magazine == null || magazine.isBlank()) {
            return false;
        }
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        final Map<Character, Integer> noteCharCount = new HashMap<>();
        final Map<Character, Integer> magCharCount = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            noteCharCount.put(c, noteCharCount.getOrDefault(c, 0) + 1);
        }
        for (char c : magazine.toCharArray()) {
            magCharCount.put(c, magCharCount.getOrDefault(c, 0) + 1);
        }
        for (char c : noteCharCount.keySet()) {
            int noteCount = noteCharCount.get(c);
            int magCount = magCharCount.getOrDefault(c, -1);
            if (noteCount > magCount) {
                return false;
            }
        }
        return true;
    }

}
