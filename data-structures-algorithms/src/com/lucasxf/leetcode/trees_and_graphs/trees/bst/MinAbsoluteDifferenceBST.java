package com.lucasxf.leetcode.trees_and_graphs.trees.bst;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

public class MinAbsoluteDifferenceBST {

    int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int abs = Integer.MAX_VALUE;
        int leftVal = Integer.MAX_VALUE;
        int rightVal = Integer.MAX_VALUE;
        if (root.left != null) {
            abs = Math.abs(root.val - root.left.val);
        }
        if (root.right != null) {
            abs = Math.min(abs, Math.abs(root.val - root.right.val));
        }
        minDiff = Math.min(minDiff, abs);
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        return 0;
    }


}
