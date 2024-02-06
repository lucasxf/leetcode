package com.lucasxf.arrays_strings;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.isBlank()) {
            return "";
        }
        String ans = "";
        StringBuilder lastPalindrome = new StringBuilder();
        int longestLength = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            if (lastPalindrome.length() > 1) {
                if (s.charAt(index - 1) == s.charAt(index + lastPalindrome.length())) {
                }
            }
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if (isPalindrome(sb.toString())) {
                    index = j;
                    if (longestLength < sb.length()) {
                        longestLength = sb.length();
                        ans = sb.toString();
                        lastPalindrome = sb;
                    }
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
