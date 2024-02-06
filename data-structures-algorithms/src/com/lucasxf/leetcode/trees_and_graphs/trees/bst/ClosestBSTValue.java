package com.lucasxf.leetcode.trees_and_graphs.trees.bst;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

import java.math.RoundingMode;

/**
 * Given the root of a binary search tree and a target value,
 * return the value in the BST that is closest to the target.
 * If there are multiple answers, print the smallest.
 * <p>
 * Success
 */
public class ClosestBSTValue {

    int ans = 0;
    double minDiff = Double.MAX_VALUE;

    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return 0;
        }
        dfs(root, target);
        return ans;
    }

    void dfs(TreeNode root, double target) {
        if (root == null) {
            return;
        }
        double diff = Math.abs(target - root.val);
        double changeDiff = Math.min(diff, minDiff);
        if (changeDiff != minDiff) {
            minDiff = changeDiff;
            ans = root.val;
        }
        if (target < root.val) {
            dfs(root.left, target);
        } else {
            dfs(root.right, target);
        }
    }

}
