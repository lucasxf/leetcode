package com.lucasxf.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * <p>
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Accepted!
 */
public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || jewels.isBlank()) {
            return 0;
        }
        if (stones == null || stones.isBlank()) {
            return 0;
        }
        final Map<Character, Integer> stoneCount = new HashMap<>();
        for (char c : stones.toCharArray()) {
            stoneCount.put(c, stoneCount.getOrDefault(c, 0) + 1);
        }
        int result = 0;
        for (char c : jewels.toCharArray()) {
            result += stoneCount.getOrDefault(c, 0);
        }
        return result;
    }

}
