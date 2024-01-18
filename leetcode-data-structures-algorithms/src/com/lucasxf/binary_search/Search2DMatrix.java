package com.lucasxf.binary_search;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int rowLeft = 0;
            int rowRight = matrix[middle].length - 1;
            int largest = Integer.MIN_VALUE;
            while (rowLeft <= rowRight) {
                int mid = rowLeft + (rowRight - rowLeft) / 2;
                int num = matrix[middle][mid];
                System.out.printf("num: %d | middle: %d | mid: %d | largest: %d %n", num, middle, mid, largest);
                if (num == target) {
                    return true;
                }
                if (num > target) {
                    rowRight = mid - 1;
                } else {
                    rowLeft = mid + 1;
                }
                largest = Math.max(largest, num);
            }
            if (largest > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }


}
