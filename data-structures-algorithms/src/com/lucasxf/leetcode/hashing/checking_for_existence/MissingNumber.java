package com.lucasxf.leetcode.hashing.checking_for_existence;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        final Set<Integer> aux = new HashSet<>();
        for (Integer num : nums) {
            aux.add(num);
        }
        final Set<Integer> result = IntStream.range(0, nums.length + 1)
                .collect(HashSet::new, Set::add, Set::addAll);

        for (Integer answer : result) {
            if (!aux.contains(answer)) {
                return answer;
            }
        }
        return 0;
    }

    public int missingNumberSimplified(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        final Set<Integer> aux = new HashSet<>();
        for (Integer num : nums) {
            aux.add(num);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!aux.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}
