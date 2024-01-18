package com.lucasxf.trees_and_graphs.trees.dfs;

import com.lucasxf.trees_and_graphs.trees.TreeNode;

/**
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.
 */
public class PathSum {

    private boolean hasPathSum;
    private int pathSum;
    private int lastVal;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            hasPathSum = (hasPathSum || (pathSum == targetSum && targetSum != 0));
            return false;
        }
        lastVal = root.val;
        pathSum += lastVal;
        hasPathSum(root.left, targetSum);
        hasPathSum(root.right, targetSum);
        if (root.right == null && root.left == null) {
            pathSum -= lastVal;
        }
        return hasPathSum = (hasPathSum || (pathSum == targetSum && targetSum != 0));
    }

    /**
     * class Solution {
     *     int target;
     *
     *     public boolean hasPathSum(TreeNode root, int targetSum) {
     *         target = targetSum;
     *         return dfs(root, 0);
     *     }
     *
     *     public boolean dfs(TreeNode node, int curr) {
     *         if (node == null) {
     *             return false;
     *         }
     *
     *         if (node.left == null && node.right == null) {
     *             return (curr + node.val) == target;
     *         }
     *
     *         curr += node.val;
     *         boolean left = dfs(node.left, curr);
     *         boolean right = dfs(node.right, curr);
     *         return left || right;
     *     }
     * }
     */
}
