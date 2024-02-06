package com.lucasxf.leetcode.hashing.checking_for_existence;

import java.util.*;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * <p>
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 * <p>
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 */
public class CheckSentencePangram {

    public boolean checkIfPangram(String sentence) {
        if (Objects.isNull(sentence) || sentence.trim().isBlank()) {
            return false;
        }
        if (sentence.trim().length() < 26) {
            return false;
        }
        final List<Character> characters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        final Set<Character> alphabet = new HashSet<>(characters);
        for (Character character : sentence.toCharArray()) {
            alphabet.remove(character);
        }
        return alphabet.isEmpty();
    }

    /**
     * simplified
     *
     * @param sentence
     * @return
     */
    public boolean checkIfPangramAlt(String sentence) {
        if (Objects.isNull(sentence)) {
            return false;
        }
        final Set<Character> alphabet = new HashSet<>();
        for (Character character : sentence.toCharArray()) {
            alphabet.add(character);
        }
        return alphabet.size() == 26;
    }

    public boolean checkIfPangramSimplest(String sentence) {
        if (Objects.isNull(sentence)) {
            return false;
        }
        final Set<Character> alphabet = new HashSet<>(26);
        for (int i = 0; i < sentence.length(); i++) {
            alphabet.add(sentence.charAt(i));
        }
        return alphabet.size() == 26;
    }
}
