package com.lucasxf.leetcode.arrays_strings;

import java.util.Arrays;

public class ReverseString {

    public char[] reversedString(char[] input) {
        int i = 0;
        int j = input.length - 1;
        while (i < j) {
            char left = input[i];
            char right = input[j];
            input[i] = right;
            input[j] = left;
            i++;
            j--;
        }
        return input;
    }

}
