package com.lucasxf.trees_and_graphs.trees.dfs;

import com.lucasxf.trees_and_graphs.trees.TreeNode;

/**
 * Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b
 * v = |a.val - b.val| and a is an ancestor of b.
 * <p>
 * A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
 */
public class MaxDifferenceBetweenNodeAndAncestor {

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int minVal, int maxVal) {
        if (root == null) {
            return 0;
        }
        int val = root.val;
        int min = Math.min(val, minVal);
        int max = Math.max(val, maxVal);
        int diff = Math.abs(max - min);
        int left = Math.max(diff, dfs(root.left, min, max));
        int right = Math.max(diff, dfs(root.right, min, max));
        return Math.max(left, right);
    }

}
