package com.lucasxf.cracking_coding_interview.c1_arrays_and_strings.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * <p>
 * - SUCCESS
 */
public class C11_IsUnique {

    // with
    public boolean isAllUniqueCharacters(String input) {
        if (input == null || input.isBlank()) {
            return false;
        }
        Set<Character> chars = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (chars.contains(c)) {
                return false;
            }
            chars.add(c);
        }
        return true;
    }

    //without
    public boolean isAllUniqueChars(String input) {
        if (input == null || input.isBlank()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (sb.toString().contains("" + c)) {
                return false;
            }
            sb.append(c);
        }
        return true;
    }

}
