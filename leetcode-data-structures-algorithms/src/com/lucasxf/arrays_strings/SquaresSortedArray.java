package com.lucasxf.arrays_strings;

import java.util.Arrays;

public class SquaresSortedArray {


    // [-4,-1,0,3,10]
    // [-7,-3,2,3,11]
    // [-5, -3, -2, -1]
    // [1, 2, 3]
    // ans[1,
    //
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            int square = nums[0] * nums[0];
            nums[0] = square;
            return nums;
        }
        int left = 0;
        int right = 1;
        int pairs = len - 1;
        int[] answer = new int[len];
        int k = 0;
        boolean hasNegative = false;
        while (right < len && left > -1) {
            int first = nums[left] * nums[left];
            int second = nums[right] * nums[right];
            if (first > second) { // negative number
                hasNegative = true;
                if (right == pairs) { // full negative array
                    answer[k++] = second;
                    right--;
                    pairs--;
                    if (--left == -1) {
                        answer[k] = first;
                    }
                } else {
                    left++;
                    right++;
                }
            } else {
                // [-4,-1,0,3,10]
                // [-7,-3,2,3,11]
                // [-5, -3, -2, -1]
                // [1, 2, 3]
                if (k == 0) {
                    answer[k++] = first;
                    left++;
                    right++;
                } else if (hasNegative) {

                }
                if (right == pairs) {
                    answer[right] = second;
                    pairs--;
                    right--;
                    left--;
                }
            }
        }
        return answer;
    }
}
